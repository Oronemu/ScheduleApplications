import SwiftUI

struct MainSettings: View {
    var body: some View {
        Form {
            Text("Четность недели")
                .font(.body)
            Picker(selection: .constant(1), label: Text("Четность недели"), content: {
                Text("Четная").tag(1)
                Text("Нечетная").tag(2)
            }).pickerStyle(SegmentedPickerStyle())
        }.navigationBarTitle(Text("Основное"), displayMode: .inline)
    }
}

struct MainSettings_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
