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

print(calculateBMI(weight: 63, height: 1.8))

let arrayOfNumbers = [1, 2, 3, 4, 5]
var sum = 0
for n in arrayOfNumbers  {
    sum += n
}

// steps in a for-in loop
for n in 1...10  where n % 2 == 0 {
//    print(n)
}

// steps in a for-loop
for n in 1..<10  where n % 4 == 0 {
//    print(n)
}


func beerSong(bottlesOfBeer totalNumber: Int)  {
    var lyrics = ""
    for num in (0...totalNumber).reversed() {
        if num == 0 {
            lyrics = "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, \(totalNumber) bottles of beer on the wall."
        } else {
            lyrics = "\(num) bottles of beer on the wall, \(num) bottles of beer.\nTake one down and pass it around, \(num-1) bottles of beer on the wall."
        }
        print("\(lyrics)\n")
    }
}

func fibonacci(until: Int) {
    var previousBeforePrevious = 0
    var previous = 1
    print(previousBeforePrevious)
    print(previous)
    
    // from iter 3
    for _ in 0...until {
        let current = previous + previousBeforePrevious
        print(current)
        previousBeforePrevious = previous
        previous = current
    }
}


func fibonacci2(until current: Int) -> Int {
    if current == 1 {return 0}
    else if current == 2 {return 1}
    else {
        return fibonacci2(until: current-2) + fibonacci2(until: current-1)
    }
}

// 0, 1, 1, 2, 3, 5 , 8, 13, 21, 34, 55
print(fibonacci2(until: 5))
print("test", terminator: "")
print("Gelo")

