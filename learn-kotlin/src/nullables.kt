fun returns(str: String?): String? {
    return str
}

class MyWolf {
    var str: String? = "a"

    fun myFunction() {
        if(str != null) {
            var s = str.toString()
        }
    } 
}



fun main() {
    // null
    var nullVar = null  // hold only null
    // wont compile
    // nullVar = 2
    if (nullVar == null){
        println("nullVar is ${nullVar}")
    }

    // won't comiple
    //var nullInt: Int = null
    var nullInt : Int? = null
    nullInt = 2
    if (nullInt == 2){
        println("nullInt is ${nullInt}")
    }

    //function with nullable type
    println(returns("aa"))
    println(returns(null))

    //array of nullables 
    var myArray: Array<String?> = arrayOf("Hi", "Hello", null)
    var myArray2 = arrayOf("Hi", "Hello", null)
    // compiler automatically reffered the type of Array<String?>
    if(myArray2 is Array<String?>) {
        println("myArray2 is of type of Array<String?>")
    }

    var myWolf = MyWolf()
    myWolf.myFunction()
}