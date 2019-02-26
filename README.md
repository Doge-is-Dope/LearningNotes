# Kotlin & Swift (& Java) 
Java
```java
System.out.println("Hello World!")
```
Kotlin
```kotlin
println("Hello World!")
```
Swift
```Swift
print("Hello World")
```

# Outline
- [Constans and Variables](https://github.com/Chun-Chieh/LearningNotes#constants-and-variables)
- [String Interpolation](https://github.com/Chun-Chieh/LearningNotes#string-interpolation)

### Constants and Variables
Kotlin uses ```val``` to define constants while Swift uses ```let```.

java
```java
int x = 3
x = 10
final static int constant = 87
```
Kotlin
```kotlin
var x = 3
x = 10
val x = 87
```
Swift
```swift
var x = 3
x = 10
let x = 87
```
### String Interpolation

Java
```java
System.out.println(String.format("I'm %d years old", myAge))
System.out.println(String.format("Good morning, %s", user.getName()))
```
Kotlin
```kotlin
println("I'm $myAge years old")
println("Good morning, ${user.name}") // object.property
```
Swift
```Swift
print("I'm \(myAge) years old")
print("Good morning, \(user.name)") // object.property
```



