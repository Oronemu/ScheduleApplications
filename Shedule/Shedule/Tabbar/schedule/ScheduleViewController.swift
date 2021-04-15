import UIKit
import WebKit

class ScheduleViewController: UIViewController, WKNavigationDelegate {

    var webView: WKWebView!
    
    override func loadView() {
        webView = WKWebView()
        webView.navigationDelegate = self
        view = webView
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        let url = URL(string: "https://kemsu-schedule.web.app")!
        webView.load(URLRequest(url: url))
    }
}
