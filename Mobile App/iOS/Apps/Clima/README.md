# Clima


- Cocoapod
- CoreLocation (work with GPS and OpenWeatherMap API)
- Networking with Alamofire (API)
- JSON parsing with SwiftyJSON
- Segue connecting between viewControllers
- Protocol

### CocoaPod Setup (Xcode 10)
Intall CocoaPod

```
sudo gem install cocoapods
```
Enter the password and wait for completion.

```
pod setup --verbose
```

### Config Podfile

Navigate to the project folder.

Add ```Podfile``` to the project folder.
```
pod init
```

Open Podfile with Xcode
```
open -a Xcode Podfile
```

uncomment ```platform :ios, '9.0'```

Add necessary pods. e.g. ```pod 'SwiftyJSON'```



### Check version
```
pod --version
```
If the version is above ```1.1.1```, it's good to go.


### Install the dependencies
```
pod install
```

### Update the dependencies if needed
```
pod update
```


# CoreLocation

### Import Module 
```swift
import CoreLocation
class ClassName: : UIViewController, CLLocationManagerDelegate {
  // ...
}
```
### Create an instance of the CLLocationManager class
```swift
let locationManager = CLLocationManager()
```

### Setup the instance
```swift
override func viewDidLoad() {
  super.viewDidLoad()

  locationManager.delegate = self
  locationManager.desiredAccuracy = kCLLocationAccuracyHundredMeters
  locationManager.requestWhenInUseAuthorization()
}
```

### Write Location Manager Delegate Methods

didUpdateLocations method
```swift
func locationManager(_ manager: CLLocationManager, didUpdateLocations locations: [CLLocation]) {
  let location = locations[locations.count - 1]
  if location.horizontalAccuracy > 0 {
  // stop updating location as soon as you've gotten a valid result
  locationManager.stopUpdatingLocation()
  // receive the data once by removing the current class from receiving messages from the location
  // while in the process of being stopped
  locationManager.delegate = nil

  let latitude = location.coordinate.latitude
  let longitude = location.coordinate.longitude
  let params : [String:String] = ["lat" : String(latitude), "lon" : String(longitude), "appid" : APP_ID]

  getWeatherData(url: WEATHER_URL, parameters: params)
  }
}
```

didFailWithError method
```swift
func locationManager(_ manager: CLLocationManager, didFailWithError error: Error) {
  print(error)
  cityLabel.text = "Location unavailable"
}
```

### Get JSON by using API
```swift
func getWeatherData(url: String, parameters: [String : String]) {
  Alamofire.request(url, method: .get, parameters: parameters).responseJSON {
    // this operation is asynchronized
    response in
    if response.result.isSuccess {
      print("Success Got weather data")
      
      let weatherJSON : JSON = JSON(response.result.value!)
    
    } else {
      print("result \(response.result.error!)")
      self.cityLabel.text = "Connection issue"
    }
  }
}
```


# Protocol

Instead of using segues when passing data backwards, we use  ```delegates```  and ```protocols``` to avoid creating new objects of the view contorllers.

1. Create ```protocol```
```swift
protocol CanReceive {
  func dataReceived(data: String)
}
```

2. Make the view controller that's receivinng data conform to the protocol and implement the required method.
```swift
class MainViewController: UIViewController, CanReceive {
  func dataReceived(data: String) {
    label.text = data
  }
}
```

3. Create a property with the optional type of the protocol in the sender view controller (class).
```swift
class AnotherViewController: UIViewController {
  var delegate: CanReceive? 
}
```

4. Send the data in a proper way.
```swift
class AnotherViewController: UIViewController {
  var delegate: CanReceive?
  
  @IBAction func sendDataBack(_ sender: Any){
    delegate?.dataReceived(data: textField.text!)
  }
}
```

5. Set the sender view controller's delegate as the view controller that's receiving data
```swift
class MainViewController: UIViewController, CanReceive {
  // ...
  override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
    if segue.identifier == "sendDataForwards" {
      let destinationViewController = segue.destination as! AnotherViewController
  
      // this line does the magic
      destinationViewController.delegate = self
    }
  }
}
```

6. Dismiss the sender view contoller
```swift
class AnotherViewController: UIViewController {
  // ...
  
  @IBAction func sendDataBack(_ sender: Any){
    delegate?.dataReceived(data: textField.text!)
    dismiss(animated: true, completion: nil)
  }
}
```
