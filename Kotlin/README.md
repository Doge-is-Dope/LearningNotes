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
println(6*50) // 300


```


### Useful References
- [Kotlin Documentation](http://kotlinlang.org/docs/reference/)




