# Clima


- Cocoapod
- CoreLocation
- Networking with Alamofire (API)

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
