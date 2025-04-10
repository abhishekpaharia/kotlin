data class Recipe(val title: String, val isVegetarian: Boolean) {  
    var mainIngredient = "" 
}

data class Recipe2(val title: String,
                   val mainIngredient: String,
                   val isVegetarian: Boolean = false,
                   val difficulty: String = "Easy") {
}

fun main() {
    var r1 = Recipe("Chicken Bhuna", false)
    r1.mainIngredient = "Chicken"
    var r2 = Recipe("Chicken Bhuna", false)
    r2.mainIngredient = "Duck"

    println("is r1 equals to r2 :  ${r1 == r2}")
    println("is r1 equals to r2 :  ${r1.equals(r2)}")
    println("hashcode of r1 is ${r1.hashCode()}")
    println("hashcode of r2 is ${r2.hashCode()}")
    println("string Rep of r1 is ${r1.toString()}")
    println("string Rep of r2 is ${r2.toString()}")

    // key-value type argument
    var r3 = r1.copy(title = "butter chicken")
    println("string Rep of r3 is ${r3.toString()}")

    // getting property values : way 1
    var title = r1.title
    var vegetarian = r1.isVegetarian
    println("title = $title, vegetarian = $vegetarian")

    // getting property values : way 2
    title = r1.component1()
    vegetarian = r1.component2()
    println("title = $title, vegetarian = $vegetarian")

    // getting property values : way 3 : like python tuple
    var (title2, vegetarian2) = r1
    //val (title2, vegetarian2) = r1
    println("title = $title2, vegetarian = $vegetarian2")

    // checks reference 
    println("is r1 and r2 points same object : ${r1 === r2}")

    //-----------------------------------------------------------------
    var rr1 = Recipe2("Spaghetti Bolognese", "Beef")
    println(rr1)
    var rr2 = Recipe2("Spaghetti Bolognese", "Tofu", true)
    println(rr2)
    // // won't compile
    //var rr3 = Recipe2("Spaghetti Bolognese", "Tofu", "Moderate")

    // named arguments : order does not matter and 
    val rr4 = Recipe2(mainIngredient = "Beef",
                   title = "Spaghetti Bolognese",
                   difficulty = "Moderate")
    println(rr4)

    // arguments in order and named arguments 
    val rr5 = Recipe2("Bolognese",
                    mainIngredient = "Beef",
                   difficulty = "Moderate")
    println(rr5)

}