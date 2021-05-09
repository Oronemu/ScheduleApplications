import SwiftUI

struct lesson:Identifiable {
    var id = UUID()
    var time:String
    var name:String
}

struct lessonList:View {
    var lesson:lesson
    
    var body: some View {
        Text(lesson.time)
            .padding(.trailing,100)
            .multilineTextAlignment(.center)
        Text(lesson.name)
    }
}

struct ContentView: View {
    var body: some View {
         let optionArray = [
            lesson(time: "9:45", name: "БЖД"),
            lesson(time: "11:20", name: "Практика"),
            lesson(time: "Ауд. 5119", name: "Ефимов Д.А.")
        ]
        
        TabView {
            //--------Расписание--------//
            NavigationView {
                Form {
                    Section(header: Text("")) {
                        List(optionArray) {
                            lesson in lessonList(lesson: lesson)
                        }
                    }
                }.navigationBarTitle(Text("Расписание"), displayMode: .inline)
            }.tabItem {
                Image(systemName: "book")
                Text("Расписание")
            }
            //--------Настройки--------//
            NavigationView {
                VStack {
                    Text("В разработке")
                        .font(.largeTitle)
                        .foregroundColor(.gray)
                    Text("Когда-то здесь будет меню настроек, нужно просто подождать...")
                        .padding(10)
                        .font(.body)
                        .foregroundColor(.gray)
                        .multilineTextAlignment(.center)
                }
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
