import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        let storyboard = UIStoryboard(name: "Tabbar", bundle: nil)
        let viewcontroller = storyboard.instantiateViewController(withIdentifier: "Tabbar")
        self.navigationController?.pushViewController(viewcontroller, animated: false)
    }


}

