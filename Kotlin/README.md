# Kotlin
Kotlin is a strong-type system featuring **type inference**. 
- Lambdas, Coroutines, Properties
- Since 2011 by JetBrain
- Open Sourced 2012
- Version 1.0 in 2016; Official for Android in 2017
- Take care of boilerplate codes (i.e. getters and setters) as below
- Compatible with Java
- null safety with nullable and non-nullable data types

In Java
```java
public class Person {
    private String mName;
    
    public Person(){}
    
    public String getName(){
        return mName;
    }  
    
    public void setName(String name) {
        this.mName = name;
    }
    
    @Override
    public String toString(){
        return "Person{name=" + mName + "}"; 
    }
} 
```
In Kotlin
```kotlin
class Person(var name: String = "")
```

## Contents
- [Operators](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#operators)
- [Mutable / Immutable variable ](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#mutable-and-immutable-variable)
- [Number](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#number)
- [Nullability](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#nullability)
- [Strings](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#strings)
- [Value Comparison](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#value-comparison)
- [Range](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#range)
- [When](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#when-switch-case)
- [Array](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#array)
- [Function](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#function)
  - [Lambda](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#lambda)
- [Main Function Arguments](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#main-arguments)
- [Unit](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#unit)
- [Class](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#class)
  - [Constructor](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#constructor)
  - [Inheritance](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#inheritance)
  - [Interface]
- [Kotlin Standard Library](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#kotlin-standard-library)
  - [Filter](https://github.com/Chun-Chieh/LearningNotes/tree/master/Kotlin#filter)

### Operators
```kotlin
println(1 + 1) // 2
println(50 - 3) // 47
println(50 / 10) // 5
println(1 / 2) // 0
println(1.0 / 2.0) // 0.5
println(6 * 50) // 300

val num = 3
num.plus(2)
num.times(1)
num.div(10)
num.minus(1)
```
### Mutable and Immutable variable
Immutable variables are the safest option when you know that a variable will never need to change values.
For example, in a multi-threaded environment, immutable variable is thread safe, because once it has been assigned by the initial thread, no thread can change it.

In Kotlin, **val** is unchangeable; **var** is changeable
```kotlin
val x = 1
x = 2 // error: val cannot be reassigned
var y = 1
y = 2
y = "Hello" // type mismatch
```
### Number
Kotlin supports underscores in numbers 
```kotlin
val oneMillion = 1_000_000
val phoneNum = 857_222_2390
```

### Casting
##### 1. Use primitive type (e.g. int) as an object
```kotlin
3.toLong()
```

##### 2. Boxing
```kotlin
val boxed: Number = 3
boxed.toLong()
```

##### Number types won't implicitly convert to other types
```kotlin
val b: Byte = 1
val i: Int = b // type mismatch
val i: Int = b.toInt() // Correct way
``` 

### Nullability
Use the question mark to indicate that a variable can be null
```kotlin
var marbles: Int? = null
```

Use exclamation mark (or called 'bang') to throw a null pointer exception
```kotlin
// double bang/not null
println(marbles!!)
```  

Use '?:' (**Elvis operator**) to check if the variable is null
```kotlin
var addressBook: List<Int?>? = null
addressBook = listOf(null, null, 3, 4)
println(addressBook?.get(0) ?: 0) // print '0' if addressBook[0] exists (and addressBook exists
```

### Strings

```kotlin
val s1= "Hello"
val s2 = "World!"
// Use '+' to concatenate strings
s1 + " " +s2
// Use string template to concatenate strings
"$s1 $s2" 
```

### Value Comparison
```kotlin
val a: Int = 999
val b: Int? = a
val c: Int? = a
```
'==' in Kotlin is called **Structural equality**. It compares the content of two objects.
```kotlin
println(b == c)    //true
```
'===' in Kotlin is called **Referential equality** (identity). It determines whether two objects share the same memory address. 
```kotlin
println(b === c)   //false
```
**'Int?'** will box the variable as an object (because it's another data type); **'Int'** won't (because it's primitive type). The address will be the same. 
```kotlin
val a: Int = 999
val b: Int = a
val c: Int = a
println(b == c)     // true
println(b === c)    // true
```

### Range
```kotlin
println(4 in 0..4) // true (4 is included)
```

### When (switch-case)
```kotlin
var fishName = "snapper"
when (fishName.length) {
    0 -> println("Fish name cannot be empty")
    in 3..12 -> println("Good fish name")
    else -> println("OK fish name")
}
```
'when' can substitute if-elses by having no arguments
```kotlin
when {
    temperature > 38 -> true
    dirty  > 30 -> true
    day == "Sunday" -> true
    else -> false
}
```
### Array
Create an untyped array
```kotlin
val color = arrayOf("Red", "Blue", "Yellow", 123, 222)
```
Create a typed array
```kotlin
val numbers = intArrayOf(1, 2, 3)
```
Create a nested array
```kotlin
var market = arrayOf(arrayOf("beef", "pork"), arrayOf("tomato", "grapes"))
```
Print an array
```kotlin
println(Arrays.toString(color))
``` 
Print the elements in an array
```kotlin
for(element in color) println(element)
```
Print the elements with index in an array
```kotlin
for((index, element) in color.withIndex()) println("Index: $index, Element: $element ")
```
Loop through ranges of elements
```kotlin
for (i in 'a'..'z') print(i)
for (i in 1..5) print(i)
``` 
Loop through a range downwards
```kotlin
for (i in 5 downTo 1) print(i)
```
Loop through a range advancing in multiple steps
```kotlin
for (i in 1..10 step 2) print(i)
```

Example
```kotlin
val array = Array(7) { 1000.0.pow(it) }
val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte","terabyte", "petabyte", "exabyte")

for ((i, value) in array.withIndex()) {
    println("1 ${sizes[i]} = ${value.toLong()} bytes")
}
```

### Function
```kotlin
fun printHello(){
    println("Hello World") 
}
printHello()
```

Arguments can have default value
The best practice is to **put arguments without defaults first** and then the ones with defaults afterwards.

```kotlin
fun swim(temperature: Int, speed: String = "fast") {
    println("Temp: $temperature. The speed is $speed")
}
swim() // use default value
swim("slow") // use custom value
swim(speed="medium") // specify the name of the argument
```

Default value can be retrieve from other function. Beware of using this expensive operation because **default parameters are evaluated at call time by Kotlin**.
```kotlin
fun getTemperatureSensorReading() = 22
fun swim(temperature: Int = getTemperatureSensorReading(), speed: String = "fast") {
    println("Temp: $temperature. The speed is $speed")
}
```

One-line function is possible in Kotlin
```kotlin
fun isTooHot(temperature: Int) = temperature > 30
fun isTooDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"
```

#### Lambda
```kotlin
val swim = { println("Swim \n")}
swim()
```
Lambda arguments go on the lfs of the function arrow; The body goes after the function arrow.
```kotlin
var dirty = 20
val waterFilter = { dirty: Int -> dirty / 2 }
waterFilter(dirty)
```
Another way to use Lambda: **Function type notation**. Function type notation is more readable, which reduces errors, clearly showing the what type is passed in and what type is returned.
```kotlin
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
waterFilter(dirty)
```

Lambda can take argements and return a value
```kotlin
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
```
It's possible to take lambda as a function's argument. (The lambda argument prefers to be the last parameter)
```kotlin
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty) 
}
```
Call lambda as a parameter.
If the function is a named function(not a lambda), '::' (double colon) is used to pass a reference.
```kotlin
fun feedFish(dirty: Int) = dirty + 10

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
}
```
A higher-order function is a function that takes functions as parameters, or returns a function.
In Kotlin, it's called **last parameter** by using a higher-order function as the last argument.
```kotlin
dirty = updateDirty(dirty) { dirty ->
    dirty + 50
}
``` 
The above is same as the following.
```kotlin
dirty = updateDirty((dirty), { dirty -> dirty + 50 })
```

Comparing a Lambda with a named function

```kotlin
val random1 = random()
val random2 = { random() }
```
random1 has a value assigned at compile time, and the value never changes when the variable is accessed.


random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.


### Main Arguments
Run -> Edit Configurations... -> Program Arguments
```kotlin
println("Hello ${args[0]}")
```

### Unit
In Kotlin, every line has a value. 
```kotlin
// print 'kotlin.Unit'
println(println())
```
```kotlin
var temperature = 20
val isHot = if (temperature > 50) true else false
println(isHot)
val message = "You are ${if(temperature > 50) "fired" else "cool"}."
```
'when' can return values in a function.
```kotlin
return when (birthday) {
        in 1..7 -> "Nice"
        28, 31 -> "Very cool"
        else -> "Something Else"
    }
```
It's valid to use the retrun value of a if-else evaluation.
```kotlin
fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int=2, hasDecorations: Boolean = true): Boolean {
    return (if (hasDecorations) tankSize * 0.8 else tankSize) - currentFish.sum() >= fishSize
}
```

### Class

```kotlin
class Person {
    var age = 20
    var gender = "male"
}

// create an instance
val p1 = Person()
```
Properties can be used directly without getters/setters
```kotlin
p1.age = 30
println("Age: ${p1.age}, Gender: ${p1.gender}")
```
#### Custom property
Sometimes a property needs a custom getter/setter
```kotlin
var volume: Int
        get() = width * height * length / 1000 
        set(value) {
            height = (value * 1000) / (width * length)
        }
```
#### Visibility modifier
Everything is **public** by default


For members declared directly inside a package:

| Modifier| Package Visibility|
| ------- | --------- |
| (public)| Everywhere |
| private | File |
| internal | Module|

```kotlin
package foo

private fun foo() { ... } // visible inside the file

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in the file
    
internal val baz = 6    // visible inside the same module
```

For members declared inside a class:

| Modifier| Class Visibility|
| ------- | --------- |
| (public)| Class & public members |
| private | Inside class (Subclasses can't see) |
| protected | Inside class (Subclasses can see) | 
| internal | Module|

```kotlin
class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // public by     default
    
    protected class Nested {
        public val e: Int = 5
    }
}
```

#### Constructor
By using var / val on the constructor arguments, it creates the member properties.
```kotlin
class Aquarium(var length: Int = 100, var height: Int = 20, var width: Int = 40) {
    ...
}
```

If another constructor is needed, use **constructor()**. (secondary constructor)
For example, add a constructor other than dimensions and calcualate based on the arguments.

```kotlin
class Aquarium(var length: Int = 100, var height: Int = 20, var width: Int = 40) {
    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000 // cm3
        val tank = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}
```
In Kotlin, overloading is not neeeded. Use **init** to do logic and initialize the properties
```kotlin
class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int
    
    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }
}
```
You can have multiple init blocks anywhere, and
**'init' blocks always run before 'constructor' blocks**.
They are executed from the top of the class to the bottom so
if any property is used before the init blocks, there's no need to call it explicitly.

Secondary constructor is not a good practice. It's better to keep a class simple by using one primary constructor and init blocks. When more flexibility is needed, helper functions can be considered

#### Inheritance

Every class in Kotlin inherits from the top level class **Any** implicitly.
```kotlin
class Person // Implicitly inherits from Any
```
To make a class inheritable, a class has to be **open**. (By default, classes are not subclassible.)
```kotlin
open class Base(p: Int)

class Derived(p: Int) : Base(p)
```

##### Overriding Method
To make a method overridable, an **open** modifier is needed for a function;
The **override** modifier is required on subclass function.
```kotlin
open class Base {
    open fun v() { ... }
}

class Derived() : Base() {
    override fun v() { ... }
}
```
#### Interface
Abstract classes and Interfaces can't be initiated. Abstract classes have constructors while Interfaces can't have any constructor.

Abstract classes start with **abstract** modifier.

```kotlin
abstract class AquariumFish {
    abstract val color: String
}

class Shark : AquariumFish() {
    override val color: String = "gray"
}

class Plecostomus : AquariumFish() {
    override val color: String = "gold"
}
```

Then, we can use it like any other class

```kotlin
fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}, Plecostomus: ${pleco.color}")
}
```

We can create Interfaces and inplement its functions.

```kotlin
class Plecostomus : AquariumFish(), fishAction {
    override val color: String = "gold"

    override fun eat() {
        println("munch on algae")
    }
}

interface fishAction {
    fun eat()
}
```




### Kotlin Standard Library
Kotlin Standard Library provides living essentials for everyday work.
E.g. repeat

```kotlin
repeat(2){
    println("A fish is swimming!")
}
```

#### Filter
Filter is a control flow structure from the standard library.
Filter will test each element against its condition and return a boolean.

```kotlin
val aList = listOf("happy", "sad", "angry", "apple")
println(aList.filter{ true }) // return all elements
println(aList.filter{ it[0] == 'a' })
println(aList.take(2).filter{ it.startWith('s') })
println(aList.filter{ it.contains('ap') }.sortedBy{ it.length })
```
By default, filter is eager. When a filter is called, it creates a new list with the elements that pass through the filter.
To apply filter lazily, asSequence() can be used to store the result as a sequence.
```kotlin
val aList = listOf("happy", "sad", "angry")
val eager = aList.filter{ it[0] == 'a' } // filter returns a list
```

// apply filter lazily
val filtered = aList.asSequence().filter{ it[0] == 'a' } // filter returns a sequence
println(filtered.toLisy()) // convert a sequence to a list
```
Another example of using asSequence:
```kotlin
val lazyMap =  aList.asSequence().map{
    println("map: $it ")
    it
}
println(lazymap) // print nothing
println("First: ${lazyMap.first()}")
println("All: ${lazyMap.toList()}")
```






### Useful References
- [Kotlin Documentation](http://kotlinlang.org/docs/reference/)




