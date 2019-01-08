package basics


// Use default parameters, at least one lambda, and pass a function as a parameter.
fun main(args: Array<String>) {
    val newOrder1 = listOf("burger", "burger", "donut", "pepper")
    println("")
}

fun printOrder()

fun order(items: List<String>, membership: Boolean = false): Double = if (membership) 0.8 else 1 * calculateTotal(items)

fun calculateTotal(items: List<String>): Double {
    var total = 0.0
    for (item in items) {
        total += when (item) {
            "burger" -> 3.5
            "fries" -> 2.0
            "coke", "sprite" -> 1.0
            "donut" -> 2.0
            else -> 0.0
        }
    }
    return total
}



