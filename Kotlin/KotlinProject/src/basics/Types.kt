package basics

import kotlin.math.pow

// Demonstrate the basic types of Kotlin
// Numeric: Int, Long, Double, Float, Short, Byte
// Logic:Boolean
// Text: Char, String
// Collection: IntArray, MutableList(ArrayList in Java), HashMap, HashSet

// syntax: range
// syntax: fun (inferred return value)

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    // Int 32 bits
    val a = 10
    println("a: $a, type: ${a.javaClass.kotlin}")

    // long 64 bits
    val b = 100L
    println("b: $b, type: ${b.javaClass.kotlin}")

    // Double 64 bits
    val c = 20.0
    println("c: $c, type: ${c.javaClass.kotlin}")

    val d = 20f
    println("d: $d, type: ${d.javaClass.kotlin}")

    // Short 16 bits
    val e: Short = 10
    println("e: $e, type: ${e.javaClass.kotlin}")

    // Byte 8 bits
    val f: Byte = 12
    println("f: $f, type: ${f.javaClass.kotlin}")

    // Character is declared in a single quote
    val character = 'S'
    println("character: $character, type: ${character.javaClass.kotlin}")

    // Boolean
    val bl = false
    println("bl: $bl, type: ${bl.javaClass.kotlin}")

    // String
    val str = "Hello World"
    println("str: $str, type: ${str.javaClass.kotlin}")


    val array = Array(7) { 1000.0.pow(it) }
    val sizes = arrayOf(
        "byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte"
    )
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} ${if(i == 0) "byte" else "bytes"}")
    }

    val numbers: IntArray = intArrayOf(3, 4, 6)
    println("numbers: ${numbers[1]}, type: ${numbers.javaClass.kotlin}")

    val mutableNumbers: MutableList<Int> = mutableListOf(12, 13, 16)
    println("mutableNumbers: $mutableNumbers, type: ${mutableNumbers.javaClass.kotlin}")
    mutableNumbers.add(18)
    println("mutableNumbers: $mutableNumbers")

    val immutableNumbers: List<Int> = mutableNumbers
    println("immutableNumbers: $immutableNumbers, type: ${immutableNumbers.javaClass.kotlin}")


    val items = listOf(1, 2, 3, 4)
    println("items: $items")
    println("First Element: " + items.first())
    println("Last Element: " + items.last())
    println("Even Numbers: " + items.filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println("readWriteMap: ${readWriteMap}, type: ${readWriteMap.javaClass.kotlin}")

    val strings = hashSetOf("a", "b", "c", "c")
    println("strings: $strings, type: ${strings.javaClass.kotlin}")


    // range is inclusive
    for (i in 100..105) {
        // equivalent of 100 < = i && i < = 105
        print("$i ")
    }

    println()
    println("sum1: ${sum1(5, 3)}")

    println("sum2: ${sum2(5, 3)}")

    printSum(5, 3)
}