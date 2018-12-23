package basics

import java.util.Arrays.asList

// Creating DTOs (POJOs/POCOs)
data class Person(val name: String, var age: Int = 0)

// Instance Checks
fun checkInstance(arg: Any) {
    when (arg) {
        is Int -> println("$arg is an integer.")
        is Double -> println("$arg is a double.")
        else -> {
            println("$arg is something else.")
        }
    }
}


fun main(args: Array<String>) {
    // Instantiate a class
    val p1 = Person("Mike", 20)
    val p2 = Person("Linda", 31)

    println("${p1.name} is ${p1.age} years old.")
    p2.age++
    println("${p2.name} is ${p2.age} years old.")
    // Default values for function parameters
    val p3 = Person("Sam")
    println("${p3.name} is ${p3.age} years old.")


    val numbers = asList(-1, -2, 3, 4, 5)
    println("Numbers: $numbers")
    // Filtering a list
    val positive = numbers.filter { it > 0 }
    println("Positive numbers: $positive")


    checkInstance(123)
    checkInstance("HHH")

    // Traversing a map/list of pairs
    val map = mapOf("Mike" to 28, "John" to 10)
    for ((K, V) in map) {
        println("$K -> $V")
    }

    // Using ranges
    for (i in 1..5) {
        // closed range: includes 5
        print(i)
    }
    for (i in 1 until 5) {
        // half-open range: does not include 5
        print(i)
    }
    println()
    for (x in 2..10 step 2) {
        print(x)
    }
    println()
    for (x in 10 downTo 1) {
        print(x)
    }
    println()
    val x = 2
    println("x in the range: ${(x in 1..10)}")


    // Read-only list
    val rList = asList(2, 3, 4, 5, "a")
    println("List: $rList")

    // Read-only map
    val rMap = mapOf(1 to "A", 2 to "B")
    println("Access the map: ${rMap[1]}")

    // Lazy property
    val p: String by lazy {
        val pp = "World" // execute first
        "Hello $pp"
    }
    println(p)

    // Extension Functions
    fun String.spaceToCamelCase() {}

}