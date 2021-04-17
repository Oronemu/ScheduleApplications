import UIKit

struct Section {
    let title: String
    let option: [SettingsOptionType]
}

enum SettingsOptionType {
    case staticCell(model: SettingsOption)
    case switchCell(model: SettingsSwitchOption)
}

struct SettingsSwitchOption {
    let tittle: String
    let icon: UIImage?
    let iconBackgroundColor: UIColor
    let handler: (() -> Void)
    let isOn: Bool
    
}

struct SettingsOption {
    let tittle: String
    let icon: UIImage?
    let iconBackgroundColor: UIColor
    let handler: (() -> Void)
}


class SettingsViewController: UIViewController, UITableViewDelegate, UITableViewDataSource {
    
    private let tableView: UITableView = {
        let table = UITableView(frame: .zero, style: .grouped)
        table.register(SettingsTableViewCell.self,
                       forCellReuseIdentifier: SettingsTableViewCell.identifier)
        table.register(SwitchTableViewCell.self,
                       forCellReuseIdentifier: SwitchTableViewCell.identifier)
        return table
    }()
    
    var models = [Section]()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        configure()
        title = "Настройки"
        view.addSubview(tableView)
        tableView.delegate = self
        tableView.dataSource = self
        tableView.frame = view.bounds
    }
    
    func configure() {
        let storyboard = UIStoryboard(name: "Settings", bundle: nil)
        
        models.append(Section(title: "Функционал", option: [
            .staticCell(model: SettingsOption(tittle: "Уведомления", icon: UIImage(systemName: "bell"), iconBackgroundColor: .systemYellow) {
                let viewcontroller = storyboard.instantiateViewController(withIdentifier: "Notifications")
                self.navigationController?.pushViewController(viewcontroller, animated: true)
            }),
            .staticCell(model:SettingsOption(tittle: "События", icon: UIImage(systemName: "calendar"), iconBackgroundColor: .systemBlue) {
                let viewcontroller = storyboard.instantiateViewController(withIdentifier: "Events")
                self.navigationController?.pushViewController(viewcontroller, animated: true)
            })
        ]))
        
        models.append(Section(title: "Интерактив", option: [
            .staticCell(model:SettingsOption(tittle: "Преподаватели", icon: UIImage(systemName: "graduationcap"), iconBackgroundColor: .systemOrange) {
                let viewcontroller = storyboard.instantiateViewController(withIdentifier: "Teachers")
                self.navigationController?.pushViewController(viewcontroller, animated: true)
            }),
            
            .staticCell(model:SettingsOption(tittle: "Карта ВУЗа", icon: UIImage(systemName: "map"), iconBackgroundColor: .systemGreen) {
                let viewcontroller = storyboard.instantiateViewController(withIdentifier: "SUMap")
                self.navigationController?.pushViewController(viewcontroller, animated: true)
            })
        ]))
        
        models.append(Section(title: "Оформление", option: [
            .staticCell(model:SettingsOption(tittle: "Внешний вид", icon: UIImage(systemName: "iphone"), iconBackgroundColor: .systemRed) {
                let viewcontroller = storyboard.instantiateViewController(withIdentifier: "Appearance")
                self.navigationController?.pushViewController(viewcontroller, animated: true)
            }),
            .switchCell(model: SettingsSwitchOption(tittle: "Темная тема", icon: UIImage(systemName: "moon"), iconBackgroundColor: .black, handler: {
                
            }, isOn: false))
        ]))
    }
    
    func tableView(_ tableView: UITableView, titleForHeaderInSection section: Int) -> String? {
        let section = models[section]
        return section.title
    }
    
    func numberOfSections(in tableView: UITableView) -> Int {
        return models.count
    }
    
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return models[section].option.count
    }
    
    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let model = models[indexPath.section].option[indexPath.row]
        
        switch model.self {
        case .staticCell(let model):
            guard let cell = tableView.dequeueReusableCell(
                withIdentifier: SettingsTableViewCell.identifier,
                for: indexPath
            ) as? SettingsTableViewCell else {
                    return UITableViewCell()
            }
            cell.configure(with: model)
            return cell
        case .switchCell(let model):
            guard let cell = tableView.dequeueReusableCell(
                withIdentifier: SwitchTableViewCell.identifier,
                for: indexPath
            ) as? SwitchTableViewCell else {
                    return UITableViewCell()
            }
            cell.configure(with: model)
            return cell
        }
    }
    
    func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        tableView.deselectRow(at: indexPath, animated: true)
        let type = models[indexPath.section].option[indexPath.row]
        switch type.self {
        case .staticCell(let model):
            model.handler()
        case .switchCell(let model):
            model.handler()
        }
    }
}
