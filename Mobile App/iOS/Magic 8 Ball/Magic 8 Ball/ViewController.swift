//
//  ViewController.swift
//  Magic 8 Ball
//
//  Created by Chun-Chieh Liang on 2/5/19.
//  Copyright © 2019 Chun-Chieh Liang. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    let ballArray = ["ball1", "ball2", "ball3", "ball4", "ball5"]

    @IBOutlet weak var imageView: UIImageView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        newBallImage()
    }
    
    override func motionEnded(_ motion: UIEvent.EventSubtype, with event: UIEvent?) {
        newBallImage()
    }

    @IBAction func askButtonPressed(_ sender: Any) {
        newBallImage()
    }
    
    func newBallImage() {
        let randomBallNumber = Int.random(in: 0 ... 4)
        imageView.image = UIImage(named: ballArray[randomBallNumber])
    }
    
}

