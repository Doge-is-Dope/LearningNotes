# Clima

- Cocoapod
- CoreLocation

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
}
```

### Setup property list (plist)

In ```Support Files```, there's ```info.plist```.

Add two new properties.

```
Privacy - Location Usage Description
Privacy - Location When In Use Usage Description
```

Add the prompt in ```value``` field. E.g. We need your location to obtain the current weather conditions

### Start updating location

After the permission is checked, we can add ```startUpdatingLocation```.

```swift
locationManager.startUpdatingLocation()
```

### Handle the location result

Write the didUpdateLocations method 
```swift
func locationManager(_ manager: CLLocationManager, didUpdateLocations locations: [CLLocation]) {
    // code that handles the result
}
```
Write the didFailWithError method
```swift
func locationManager(_ manager: CLLocationManager, didFailWithError error: Error) {
    // code that handles the error
}
```
