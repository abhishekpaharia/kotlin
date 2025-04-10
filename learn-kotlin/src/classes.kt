// properties : name is defined in constructor. Note breedParam do not have val 
// or var, so weightParam, breedParam is a normal constructor parameter but not instance property
class Dog(val name: String, weightParam: Int, breedParam: String) {
    var weight = weightParam
        set(value) {
            if(value > 0) field = value
        }
    init {
        println("Dog $name and $weight has been created")
    }
    // properties: breed and activities are defined in class body
    val breed = breedParam.uppercase()
    var activities = arrayOf("Walks") 
    var temperament : String
    // wont compile
    //lateinit var hairLength: Int
    lateinit var hair: String

    //property with getter
    val weightInKgs: Double
        get() = weight / 2.2

    
    init {
        println("The breed is $breed.")
        temperament = "default Temperament"
    }  

    fun bark() {
        println(if(weight < 20) "Yip!" else "Woof!")
    }
}

// no contructor
class Duck {
    fun quack() {
        println("Quack! Quack! Quack")
    }
}

// secondary constructor
class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagicParam: Boolean) : this(0, isMagicParam) {
        println("secondary constructor is called")
    }

    override fun toString(): String {
        return "Mushroom(size = $size, isMagic = $isMagic)"
    }
}
fun main() {
    var myDog = Dog("Fido", -70, "Mixed")
    println("myDog is ${myDog}")

    // getting property
    println("myDog's name is ${myDog.name}")

    // Note setter is not called when object is initialise, so it have negative weight
    println("my dog weight is ${myDog.weight}") 

    //setting property
    myDog.weight = 50
    myDog.bark()

    var dogs = arrayOf(Dog("bruno", 45, "Mixed"), Dog("Ripper", 10, "Foodle"))
    dogs[1].weight = 15
    dogs[1].bark()

    var myDuck = Duck()
    myDuck.quack()

    // accesing property which has getter
    println("my dog weight is ${myDog.weightInKgs}")

    // setting property which has setter
    myDog.weight = -10
    // value is not set because is negative 
    println("my dog weight is ${myDog.weight}")

    var myMushroom = Mushroom(1, true)
    println(myMushroom)
    // calling secondary constructor
    var myMushroom2 = Mushroom(false)
    println(myMushroom2)
}