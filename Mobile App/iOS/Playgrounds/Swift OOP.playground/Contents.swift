import UIKit


enum CarType {
    case Sadem
    case Coupe
    case Hatchback
}

class Car {
    var color = "Black"
    var numOfSeats = 5
    var typeOfCar: CarType = .Sadem
    
    // Designated constructor
    init (){
    }
    
    // Conveneince constructor
    convenience init (color: String) {
        self.init()
        self.color = color
    }
    
    func drive ()  {
        print("Car is moving")
    }
}


let c1 = Car(color: "Red")
print("C1: \(c1.color), \(c1.numOfSeats), \(c1.typeOfCar)")
c1.drive()
