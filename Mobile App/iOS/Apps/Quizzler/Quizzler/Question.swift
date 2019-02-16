//
//  Question.swift
//  Quizzler
//
//  Created by Chun-Chieh Liang on 2/13/19.
//  Copyright © 2019 Chun-Chieh Liang. All rights reserved.
//

import Foundation

class Question {
    let text: String
    let correctAnswer: Bool
    
    init(text: String, correctAnswer: Bool) {
        self.text = text
        self.correctAnswer = correctAnswer
    }
}
