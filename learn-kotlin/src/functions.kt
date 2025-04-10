// Note: one can not remove return type declaration from the function signature if it returning something
// return type cant be inferred by kotlin in normal function declatation
fun funName(param1: Int, param2: String, param3: Boolean): Int {
    return (Math.random()*3).toInt()
}

// no return 
fun prints(int1: Int) {
    println(int1)
}

// no return : Unit is equivalent to void
fun prints2(int1: Int) : Unit {
    println(int1)
}

// single expression bodies function
fun max(a : Int, b: Int) : Int = if(a > b) a else b

// return type is inferred by compiler in single expression body function
fun min(a: Int, b: Int) = if(a < b) a else b

// default parameter values
fun findRecipe(title: String, ingredient: String, isVegetarian: Boolean = false, difficulty: String = "easy") : Array<String> {
    return arrayOf("butter chicken")
}

// function overloading 
fun addNumbers(a: Int, b: Int) : Int {
 return a + b
}

fun addNumbers(a: Double, b: Double) : Double {
 return a + b
}

fun main() {
    var x: Int = funName(1, "as", true)
    println(x)
    prints(1)
    prints(2)

    println(max(1,2))
    println(min(1,2))

    // calling by arguments in order and named arguements
    var recipe = findRecipe("butter chicken", ingredient = "cbicken", difficulty = "moderate")
    println("recipe = $recipe")

    //function overloading
    println(addNumbers(1.6, 7.3))
    println(addNumbers(2, 3))
}