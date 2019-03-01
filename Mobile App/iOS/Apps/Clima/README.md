# Clima


- Cocoapod
- CoreLocation (work with GPS and OpenWeatherMap API)
- Networking with Alamofire (API)
- JSON parsing with SwiftyJSON

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

