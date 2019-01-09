package Practice

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium(){
    val mAquarium = Aquarium()

    println("Length: ${mAquarium.length}, Height: ${mAquarium.height}, Width: ${mAquarium.width}")

    mAquarium.height = 80
    println("Length: ${mAquarium.length}, Height: ${mAquarium.height}, Width: ${mAquarium.width}")
    println("Volume: ${mAquarium.volume} litters")

    mAquarium.volume = 10
    println("Length: ${mAquarium.length}, Height: ${mAquarium.height}, Width: ${mAquarium.width}")
    println("Volume: ${mAquarium.volume} litters")
}