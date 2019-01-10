package Practice

import kotlin.math.PI

open class Aquarium(var length: Int = 100, var height: Int = 20, var width: Int = 40) {

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open var water = volume * 0.9

    constructor(numberOfFish: Int) : this() {
        val water = numberOfFish * 2000 // cm3
        val tank = water + water * 0.1
        println(tank)
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank(): Aquarium(){
    override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }

    override var water = volume * 0.8
}

