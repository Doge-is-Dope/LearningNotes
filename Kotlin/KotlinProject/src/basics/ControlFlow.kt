package basics

// Conditional expression: if-else, when
// nullable values
// Loop: For loop (3 ways to get the elements, withIndex()), While loop
// label, continue and break

// range: .. (inclusive)

fun printProduct(arg1: String, arg2: String) {
    val n1 = arg1.toIntOrNull()
    val n2 = arg2.toIntOrNull()

    if (n1 == null) {
        println("Wrong format: $arg1")
        return
    }
    if (n2 == null) {
        println("Wrong format: $arg2")
        return
    }

    println("$arg1 * $arg2 = ${n1 * n2}")
}


fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null

    return obj.length
}


fun main(args: Array<String>) {
    val a = 3
    val b = 10
    val max: Int

    // if-else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("max: $max")

    // 1-line if-else
    println("max: " + if (a > b) a else b)

    // when
    val x: Any
    x = 3
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("Either 3 or 4. Wait...Actually it's $x.")
        "Hello" -> println("Wolrd")
        else -> println("Neither 1 nor 2. It's $x.")
    }


    val items = listOf("Book", 2, 3, true)

    // print the elements of an array list
    for (item in items) print("$item ")
    println()

    // Another way to print the iterable elements
    for (index in items.indices) print("${items[index]} ")
    println()

    // Another way to print the iterable elements
    items.forEach {
        //        if (it == 3) return // non-local return directly to the caller of foo()
        print("$it ")
    }
    println()

    // print the value along with the index
    for ((index, value) in items.withIndex()) println("index: $index, value: $value")


    // while loop
    var count = 10
    while (count != 0) {
        print("$count ")
        count--
    }
    println()

    // do-while loop
    do {
        print("$count ")
        count++
    } while (count <= 10)

    println(count)

    // label, continue and break
    println("Example of Break and Continue")
    mLabel@ for (iter in 1..10) { // appling the custom label
        if (iter == 5) {
            println("I am inside if block with value $iter\n-- hence it will close the operation")
            break@mLabel //specifing the label
        } else {
            println("I am inside else block with value $iter")
            continue@mLabel
        }
    }

    printProduct("2", "3")
    printProduct("abb", "123")

    println("String length: ${getStringLength("Hello World")}")
    println("String length: ${getStringLength(132)}")

    for (a1 in 1..10 step 2) {
        print(a1)
    }
    println()
    for (a2 in 9 downTo 0 step 3) {
        print(a2)
    }

    println()
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
}