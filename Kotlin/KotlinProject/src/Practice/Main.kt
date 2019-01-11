package Practice

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
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

}


fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}, Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}