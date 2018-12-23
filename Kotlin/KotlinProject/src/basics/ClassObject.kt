package basics

class MyClass {
    private val myName = "John"

    fun printName() {
        println("The name is $myName")
    }
}


class Outer {
    private val msg = "This is a message"

    class Nested {
        // Nested class is by default static,
        // hence, it can be accessed without creating any object of that class
        fun foo() {
            println("This is the inner class")
        }
    }

    inner class Inner {
        // Inner class can access the data member of the outer class.
        fun foo() {
            println("This is the inner class, $msg")
        }
    }
}

interface Animal {
    fun run()
}

fun main(args: Array<String>) {
    var obj = MyClass()
    obj.printName()

    Outer.Nested().foo()
    Outer().Inner().foo()

    // Anonymous Inner Class
    val dog: Animal = object : Animal {
        override fun run() {
            println("The dog can run.")
        }
    }
    dog.run()
}