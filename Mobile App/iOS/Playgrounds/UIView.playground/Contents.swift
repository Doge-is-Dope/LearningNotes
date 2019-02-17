//: A UIKit based Playground for presenting user interface
  
import UIKit
import PlaygroundSupport

class MyViewController : UIViewController {
    
    override func viewDidLoad() {
        let square = UIView(frame: CGRect(x: 50, y: 50, width: 100, height: 100))
        square.backgroundColor = UIColor.red
        self.view.addSubview(square)
        
        
        let anotherSquare = UIView(frame: CGRect(x: self.view.frame.width / 2, y: self.view.frame.height / 2, width: 50 , height: 50))
        anotherSquare.backgroundColor = UIColor.yellow
        self.view.addSubview(anotherSquare)
    }
}
// Present the view controller in the Live View window
PlaygroundPage.current.liveView = MyViewController()
