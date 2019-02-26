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

class SelfDrivingCar: Car {
    var destination: String?
    
    override func drive() {
        super.drive()
        if let userSetDestination = destination {
            print("Driving towards \(userSetDestination)")
        }
    }
}

let sc1 = SelfDrivingCar()
sc1.destination = "1 Hacker Way"
sc1.drive()

var x : String?
print(x!)
