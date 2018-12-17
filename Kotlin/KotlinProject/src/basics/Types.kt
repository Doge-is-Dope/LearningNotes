package basics

// Demonstrate the basic types of Kotlin
// Numeric: Int, Long, Double, Float, Short, Byte
// Logic:Boolean
// Text: Char, String
// Collection: IntArray, MutableList(ArrayList in Java), HashMap, HashSet

// syntax: range


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

    val bl = false
    println("bl: $bl, type: ${bl.javaClass.kotlin}")

    val str = "Hello World"
    println("str: $str, type: ${str.javaClass.kotlin}")


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
}