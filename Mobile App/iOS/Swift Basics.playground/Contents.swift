import UIKit

var myAge: Int = 32
myAge = 33

let firstName = "Mike"
let lastName = "Jordan"
let fullName = "\(firstName) \(lastName)"

// Buy milk
func buyMilk(quantity: Int) -> Int {
    print("A bottle of milk is $10")
    print("You want to buy \(quantity) bottles")
    return quantity * 10
}


func loveCalculator(yourName: String, theirName: String) -> String {
    let loveScore = arc4random_uniform(101)
    
    if loveScore > 80 {
        return "You love each other"
    } else {
        return "No love possible"
    }
}

print("The total is $\(buyMilk(quantity: 6))")
print(loveCalculator(yourName: "Hank", theirName: "Hannah"))

