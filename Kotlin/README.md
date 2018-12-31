# Kotlin
Kotlin is a strong-type system featuring **type inference**. 
- Lambdas, Coroutines, Properties
- Since 2011
- Open Sourced 2012
- Version 1.0 in 2016; Official for Android in 2017
- Take care of boilerplate codes

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




