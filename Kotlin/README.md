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
s1 = "A"
s2 = "A"
s1 == s2 // true
s1 != s2 // false
```


### Ranges
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
```kotlin
fun swim(temparature: Int, speed: String = "fast") {
    println("Temp: $temparature. The speed is $speed")
}
swim() // use default value
swim("slow") // use custom value
swim(speed="medium") // specify the name of the argument
```
The best practice is to **put arguments without defaults first** and then the ones with defaults afterwards.

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
Also, 'when' can return values in a function.
```kotlin
return when (birthday) {
        in 1..7 -> "Nice"
        28, 31 -> "Very cool"
        else -> "Something Else"
    }
```

### Useful References
- [Kotlin Documentation](http://kotlinlang.org/docs/reference/)




