/* Interface can have abstract and concrete function (like default methods in java) and property but 
It can't have state
*/
interface Roamable {
    val velocity: Int
        get() = 20

    // abstract
    fun roam()

    // concrete
    fun roamConcrete() {
        println("the Roamable velocity is ${velocity}")
        println("The Roamable is roaming")
    }
}

// No parenthesis after Roamable indicates it is a interface and nor class (abstract or concrete)
class Vehicle(): Roamable {
    override fun roam() {
        println("the Vehicle velocity is ${velocity}")
        println("vehicle is roaming")
    }
}

/*since interfaces can have concrete functions then it can leads to diamond problem
where two interface have two implementation of function with same name
*/
interface A {
    fun myFunction() { println("from A")}
}

interface B {
    fun myFunction() { println("from B")}
}

class X : A, B {
    override fun myFunction() {
        super<A>.myFunction()
        super<B>.myFunction()
    }
}
fun main() {
    var myVehicle = Vehicle()
    myVehicle.roam()
    myVehicle.roamConcrete()

    var x = X()
    x.myFunction()
}