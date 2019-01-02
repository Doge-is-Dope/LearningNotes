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
### Changeable and unchangeable variable
**val** is unchangeable; **var** is changeable
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





### Useful References
- [Kotlin Documentation](http://kotlinlang.org/docs/reference/)




