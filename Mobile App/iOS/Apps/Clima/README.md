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


