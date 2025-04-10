fun main() {
    // variable 
    var x = 3
    val name = "Cormoran"
    x = x * 10
    println("x is $x.")

    // loops 
    while(x > 20) {
        x = x - 1
        println("x is $x.")
    }

    println("------------------")

    // for loops 
    for(i in 1..5) {
        x = x + 1
        println("x is $x.")
        // print [1, 2, ..., 5], 1 and 5 are inculsive
    }

    println("------------------")
    // print [1, 2, 3, 4] 5 is excluded
    for  (i in 1 until 5) print("$i, ")

    println()
    println("------------------")
    // print [5 ,4, 3, 2, 1], 1 is included
    for( i in 5 downTo 1) print("$i, ")

    println()
    println("------------------")

    for (i in 1..10 step 2) print("$i, ")

    println()
    println("------------------")

    var arr = arrayOf("a", "b", "c")
    for(item in arr){
        println("$item is an item in the array")
    }

    println("------------------")
    for((index, item) in arr.withIndex()){
        println("Index $index has item $item")
    }
    
    // if else 
    if(x == 20) {
        println(" x must be 20.")
    } else {
        println(" x is not 20.")
    }

    if(name.equals("Cormoran")) {
        println("$name Strike")
    }

    // tertiary operator
    x = 3
    val y = 1
    println(if(x > y) "x is greater than y" else "x is not greater than y")

    // operators 
    x++
    x--
    x += 2
    println("x is $x")

    // boolean tests 
    // < , >, ==, !=,  <=, >=, 
    
    // logical operators : short cruiting happens in logical operators 
    var xBool = true
    var yBool = false
    // and
    println(xBool && yBool)
    // or
    println(xBool || yBool)
    // not
    println(!xBool)
    
}