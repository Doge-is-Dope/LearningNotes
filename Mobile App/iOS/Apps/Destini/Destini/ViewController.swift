//
//  ViewController.swift
//  Destini
//
//  Created by Philipp Muellauer on 01/09/2015.
//  Copyright (c) 2015 London App Brewery. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    
    var storyIndex = 1
    var topButtonClicked = false
    var bottomButtonClicked = false
    
    // UI Elements linked to the storyboard
    @IBOutlet weak var restartButton: UIButton!
    @IBOutlet weak var topButton: UIButton!         // Has TAG = 1
    @IBOutlet weak var bottomButton: UIButton!      // Has TAG = 2
    @IBOutlet weak var storyTextView: UILabel!
    
    
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        restartButton.isHidden = true
        
        chooseStory()
    }
    
    func updateUI(story: String, ansA: String?, ansB: String?) {
        restartButton.isHidden = true
        storyTextView.text = story
        if ansA == nil || ansB == nil {
            topButton.isHidden = true
            bottomButton.isHidden = true
            if storyIndex == 4 || storyIndex == 5 || storyIndex == 6 {
                restartButton.isHidden = false
            }
        } else {
            topButton.isHidden = false
            bottomButton.isHidden = false
            topButton.setTitle(ansA, for: .normal)
            bottomButton.setTitle(ansB, for: .normal)
        }
    }
    
    func chooseStory() {
        if storyIndex == 1 {
            updateUI(story: Stories().story1, ansA: Stories().answer1a, ansB: Stories().answer1b)
        } else if storyIndex == 2 {
            updateUI(story: Stories().story2, ansA: Stories().answer2a, ansB: Stories().answer2b)
        } else if storyIndex == 3 {
            updateUI(story: Stories().story3, ansA: Stories().answer3a, ansB: Stories().answer3b)
        } else if storyIndex == 4 {
            updateUI(story: Stories().story4, ansA: nil, ansB: nil)
        }else if storyIndex == 5 {
            updateUI(story: Stories().story5, ansA: nil, ansB: nil)
        }else if storyIndex == 6 {
            updateUI(story: Stories().story6, ansA: nil, ansB: nil)
        }
    }
    
    
    // User presses one of the buttons
    @IBAction func buttonPressed(_ sender: UIButton) {
        if storyIndex == 1 {
            if sender.tag == 1 {
                storyIndex = 3
            } else if sender.tag == 2 {
                storyIndex = 2
            }
        } else if storyIndex == 2 {
            if sender.tag == 1 {
                storyIndex = 3
            } else if sender.tag == 2 {
                storyIndex = 4
            }
        } else if storyIndex == 3 {
            if sender.tag == 1 {
                storyIndex = 6
            } else if sender.tag == 2 {
                storyIndex = 5
            }
        }
        
        if sender.tag == 3 {
            storyIndex = 1
        }
        chooseStory()
    }
}

