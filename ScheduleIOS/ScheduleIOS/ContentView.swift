import SwiftUI

struct option:Identifiable {
    var id = UUID()
    var name:String
    var image:String
}

struct optionsList:View {
    var option:option
    
    var body: some View {
        Text(option.name)
        Spacer()
        Image(systemName: option.image)
            .font(.title2)
            .foregroundColor(.white)
            .frame(width: 40, height: 40, alignment: .center)
            .background(Color.init(#colorLiteral(red: 0.2588235438, green: 0.7568627596, blue: 0.9686274529, alpha: 1)))
            .clipShape(RoundedRectangle(cornerRadius: 10))
    }
}

struct ContentView: View {
    var body: some View {
        let optionArray = [
            option(name: "Уведомления", image: "bell"),
            option(name: "Учителя", image: "graduationcap"),
            option(name: "Карта ВУЗа", image: "map"),
            option(name: "Внешний вид", image: "iphone"),
        ]
        
        TabView {
            //--------Расписание--------//
            NavigationView {
                Form {
                    
                }.navigationBarTitle(Text("Расписание"), displayMode: .inline)
            }.tabItem {
                Image(systemName: "book")
                Text("Расписание")
            }
            //--------Настройки--------//
            NavigationView {
                Form {
                    Section(header: Text("Кнопочки")) {
                        List(optionArray) {
                            option in optionsList(option: option)
                            
                        }
                    }
                }.navigationBarTitle(Text("Расписание"), displayMode: .inline)
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
        //.preferredColorScheme(.dark)
    }
}
