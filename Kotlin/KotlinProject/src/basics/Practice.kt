package basics


fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
}

fun getMood(): String? {
    print("What's your mood? ")
    return readLine()
}

fun shallGoForAWalk(mood: String, weather: String) = mood == "happy" && weather == "Sunny"
fun shallStayInBed(mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0

fun shallGoSwimming(temperature: Int) = temperature > 35
fun shallWearMoreClothes(temperature: Int) = temperature < 15


fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        shallGoForAWalk(mood, weather) -> "go for a walk"
        shallStayInBed(mood, weather, temperature) -> "stay in bed"
        shallGoSwimming(temperature) -> "go swimming"
        shallWearMoreClothes(temperature) -> "wear more clothes"
        else -> "Stay home and read."
    }
}
