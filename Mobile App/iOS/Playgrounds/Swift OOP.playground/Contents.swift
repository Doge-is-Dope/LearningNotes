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
    var destination: String = "1 Infinite Loop"
    
    override func drive() {
        super.drive()
        print("Driving towards \(destination)")
    }
}

let sc1 = SelfDrivingCar()
sc1.drive()
