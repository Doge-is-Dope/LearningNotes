package basics

import java.util.*


// Aquarium Management System

fun main(args: Array<String>) {
    feedTheFish()

    repeat(2){
        println("A fish is swimming!")
    }
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
    return when {
        isTooHot(temperature) -> true
        isTooDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}


fun isTooHot(temperature: Int) = temperature > 30
fun isTooDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"


//fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
//    return (if (hasDecorations) tankSize * 0.8 else tankSize) - currentFish.sum() >= fishSize
//}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eats $food")

    if (shouldChangeWater(day)) println("Change water today")
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}