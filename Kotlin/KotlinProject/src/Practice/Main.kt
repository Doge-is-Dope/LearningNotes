package Practice

fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium(){
    val mAquarium = Aquarium()

    println("Length: ${mAquarium.length}, Height: ${mAquarium.height}, Width: ${mAquarium.width}")
}