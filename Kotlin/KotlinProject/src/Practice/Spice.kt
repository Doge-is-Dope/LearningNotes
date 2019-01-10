package Practice

class Spice(val name: String, private val spiciness: String = "") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 1
            "medium" -> 3
            "spicy" -> 5
            "very spicy" -> 7
            "extremely spicy" -> 10
            else -> 0
        }

    init {
        println("Name: $name, Heat: $heat")
    }



}

fun makeSalt() = Spice("salt")