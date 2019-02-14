//
//  Question.swift
//  Quizzler
//
//  Created by Chun-Chieh Liang on 2/13/19.
//  Copyright © 2019 Chun-Chieh Liang. All rights reserved.
//

import Foundation

class Question {
    let questionText: String
    let answer: Bool
    
    init(text: String, answer: Bool) {
        self.questionText = text
        self.answer = answer
    }
}
