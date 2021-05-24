import SwiftUI
import Firebase

let db = Firestore.firestore()

private func getCollection() {
       db.collection("lessons").getDocuments() { (querySnapshot, err) in
           if let err = err {
               print("Error getting documents: \(err)")
           } else {
               for document in querySnapshot!.documents {
                   print("\(document.documentID) => \(document.data())")
               }
           }
       }
   }

struct lesson:Identifiable {
    var id = UUID()
    var time:String
    var name:String
}

struct lessonList:View {
    var lesson:lesson
    var body: some View {
        Text(lesson.time)
            .padding(.trailing,50)
            .multilineTextAlignment(.center)
        Text(lesson.name)
            .frame(maxWidth: .infinity, alignment: .center)
            .multilineTextAlignment(.center)
    }
}

struct ContentView: View {
    var body: some View {
         let optionArray = [
            lesson(time: "9:45", name: "БЖД"),
            lesson(time: "11:20", name: "Практика"),
            lesson(time: "Ауд. 5119", name: "Ефимов Д.А.")
        ]
        let optionArray2 = [
           lesson(time: "11:45", name: "Циклические виды спорта"),
           lesson(time: "13:20", name: "Практика"),
           lesson(time: "Ауд. тир", name: "Тюкалова С.А.")
       ]
        let optionArray3 = [
           lesson(time: "13:30", name: "Дискретная математика"),
           lesson(time: "15:05", name: "Практика"),
           lesson(time: "Ауд. 5106", name: "Гутова С.Г.")
       ]
        let optionArray4 = [
           lesson(time: "15:30", name: "Алгебра и геометрия"),
           lesson(time: "17:05", name: "Практика"),
           lesson(time: "Ауд. 5106", name: "Медведев А.В.")
       ]
        
        TabView {
            //--------Расписание--------//
            NavigationView {
                Form {
                    Section {
                        List(optionArray) {
                            lesson in lessonList(lesson: lesson)
                        }
                    }
                    Section {
                        List(optionArray2) {
                            lesson in lessonList(lesson: lesson)
                        }
                    }
                    Section {
                        List(optionArray3) {
                            lesson in lessonList(lesson: lesson)
                        }
                    }
                    Section {
                        List(optionArray4) {
                            lesson in lessonList(lesson: lesson)
                        }
                    }
                }.navigationBarTitle(Text("Расписание"), displayMode: .large)
            }.tabItem {
                Image(systemName: "book")
                Text("Расписание")
            }
            //--------Настройки--------//
            NavigationView {
                Form {
                    NavigationLink(destination: MainSettings()){
                        Image(systemName: "gearshape")
                            .font(.title2)
                            .padding(10)
                            .background(Color.init(#colorLiteral(red: 0.007702471688, green: 0.5810722709, blue: 0.9866016507, alpha: 1)))
                            .foregroundColor(.white)
                            .clipShape(RoundedRectangle(cornerRadius: 10))
                        Text("Основное")
                    }
                }.navigationBarTitle(Text("Настройки"), displayMode: .large)
            }.tabItem {
                Image(systemName: "gearshape")
                Text("Настройки")
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
      //  ContentView()
      //      .preferredColorScheme(.dark)
    }
}
