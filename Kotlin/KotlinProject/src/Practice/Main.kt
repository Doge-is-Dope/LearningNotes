package Practice

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val mAquarium = Aquarium()

    println("Length: ${mAquarium.length} cm, Height: ${mAquarium.height} cm, Width: ${mAquarium.width} cm")

    mAquarium.height = 80
    println("Length: ${mAquarium.length} cm, Height: ${mAquarium.height} cm, Width: ${mAquarium.width} cm")
    println("Volume: ${mAquarium.volume} litters")

    val smallAquarium = Aquarium(20, 15, 30)
    println("Volume: ${smallAquarium.volume} litters")

    val smallAquarium2 = Aquarium(numberOfFish = 10)
    println(
        "Small Aquarium 2:\n" +
                "Volume: ${smallAquarium2.volume} litters, " +
                "Length: ${smallAquarium2.length} cm, " +
                "Height: ${smallAquarium2.height} cm, " +
                "Width: ${smallAquarium2.width} cm"
    )

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy"),
        Spice("sugar"),
        makeSalt()
    )
    println()
    val spices2 = spices1.filter { it.heat <= 5 }.sortedWith(compareBy ({ it.heat }, {it.name}))
    for (s in spices2)
        println("Name: ${s.name}, Heat: ${s.heat}")
}