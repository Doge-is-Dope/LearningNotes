package Practice


// Use default parameters, at least one lambda, and pass a function as a parameter.
fun main(args: Array<String>) {
    repeat(2) {
        println("Order: ${order(true)}")
    }

}


fun getOrder(): List<String> {
    print("Enter the set number: ")
    return when (readLine()?.toInt()) {
        1 -> listOf("burger", "burger", "donut", "pepper")
        2 -> listOf("burger", "fries", "sprite")
        3 -> listOf("fries", "coke")
        else -> listOf()
    }
}

var addCheese: (Boolean) -> Double = { hasCheese -> if (hasCheese) 1.0 else 0.0 }

fun updateToppings(total: Double): Double {
    print("Add cheese? ")
    val ans = readLine()!!.toBoolean()
    return total + addCheese(ans)
}


fun order(membership: Boolean = false, items: List<String> = getOrder()): Double =
    (if (membership) 0.8 else 1.0) * calculateTotal(items)

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
    return updateToppings(total)
}



