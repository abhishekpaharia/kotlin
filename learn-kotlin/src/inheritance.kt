open class Vehicle() {
    open fun lowerTemperature() {
        println("Turn down temperature")
    }
}

open class Car(val make: String, val model: String ) : Vehicle() {
    // code for car class
    final override fun lowerTemperature() {
        println("Turn on air conditioning")
    }

    fun prints() {
        println("make = $make, model = $model")
    }
}

class ConvertibleCar(makeParam: String, modelParam: String) : Car(makeParam, modelParam) {
    // // can't are override because lowerTemperature() is final
    // override fun lowerTemperature() {
    //     println("open roof")
    // }
}


open class Animal {
    var image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10


    open fun makeNoise() {
        println("The animal make noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The animal is sleeping")
    }
}

class Hippo : Animal() {
    //override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    init {
        image = "hippo.jpg"
    }

    override fun makeNoise() {
        println("Grunt Grunt")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }

}
fun main() {
    var myCar: Car = ConvertibleCar("toyota", "big")
    myCar.prints()

    var myAnimal: Animal = Hippo()
    myAnimal.eat()
}