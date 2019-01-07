package basics

import kotlin.random.Random


fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy", "sunny"))
    println(whatShouldIDoToday("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday(getMood()!!))

    val rollDice = { Random.nextInt(1, 12)}
    println(rollDice.toString())
}

fun getMood(): String? {
    print("What's your mood? ")
    return readLine()
}

fun isHappySunny(mood: String, weather: String) = mood == "happy" && weather == "Sunny"
fun isSadRainyCold(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isVeryHot(temperature: Int) = temperature > 35
fun isVeryCold(temperature: Int) = temperature < 0


fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHappySunny(mood, weather) -> "go for a walk"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isVeryHot(temperature) -> "go swimming"
        isVeryCold(temperature) -> "wear more clothes"
        else -> "Stay home and read."
    }
}


