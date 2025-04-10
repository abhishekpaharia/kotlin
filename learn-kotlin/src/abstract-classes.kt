// No need for open keyword in abstract classes, methods, property
abstract class Animal {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10


    abstract fun makeNoise()

    abstract fun eat()

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"


    override fun makeNoise() {
        println("Grunt Grunt")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }

}


fun main() {
    var myAnimal: Animal = Hippo()
    myAnimal.eat()
}