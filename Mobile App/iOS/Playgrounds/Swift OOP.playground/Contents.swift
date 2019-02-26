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
        
    }
}


let c1 = Car(color: "Red")
print("C1: \(c1.color), \(c1.numOfSeats), \(c1.typeOfCar)")
c1.drive()

let c2 = Car()
c2.drive()


let sc1 = SelfDrivingCar()
print("sc: \(sc1.color)")
sc1.drive()
