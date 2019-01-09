package Practice

class Aquarium {
    var width = 20
    var height = 30
    var length = 100

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
}

