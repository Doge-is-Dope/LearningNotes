import UIKit

var myAge: Int = 32
myAge = 33

let firstName = "Mike"
let lastName = "Jordan"
let fullName = "\(firstName) \(lastName)"



// Calcaulate BMI
func calculateBMI(weight: Double, height: Double) -> String {
    let bmi = weight / pow(height, 2)
    let shotendBMI = String(format: "%1.2f", bmi)
    var interpretation = ""
    
    
    if bmi > 25 {
        interpretation = "overweight"
    } else if bmi > 18.5 {
        interpretation = "normal weight"
    } else {
        interpretation =  "underweight"
    }
    return "Your BMI is \(shotendBMI) and you are \(interpretation)"
}

// Calcaulate BMI imperial unit
func calculateBMI2(weightInPounds: Double, heightInFoots: Double, heightRemainInches: Double) -> String {
    
    let bmi = weightInPounds * 0.45359237 / pow((heightInFoots * 12 + heightRemainInches) * 0.0254, 2)
    let shotendBMI = String(format: "%1.2f", bmi)
    var interpretation = ""
    
    
    if bmi > 25 {
        interpretation = "overweight"
    } else if bmi > 18.5 {
        interpretation = "normal weight"
    } else {
        interpretation =  "underweight"
    }
    return "Your BMI is \(shotendBMI) and you are \(interpretation)"
}

print(calculateBMI(weight: 63, height: 1.8))
print(calculateBMI2(weightInPounds: 140, heightInFoots: 5, heightRemainInches: 11))



