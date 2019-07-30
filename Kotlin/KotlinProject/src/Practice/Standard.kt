package Practice


fun test() {
    var mood = "I am sad"

    run {
        val mood = "I am happy"
        println(mood)
    }

    println(mood)

}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0

    for (el in array) {
        sum += el + 1
        print(sum)
    }

    println()

    val a = { i: Int -> i + 1 }
    println("a: $a")


//    test()

}