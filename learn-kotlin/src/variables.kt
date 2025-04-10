fun main() {
// Integers
    var x = 6
    var xExplict : Int = 8
    var long = 7L
    var longExplict: Long = 100000
    var smallInt : Short = 2
    var byte : Byte = 1

    // string
    val str = "abc"
    var strExplict : String = "abcdef"

    // char
    var letter = 'S'
    var letterExplict : Char = 'D'

    // double and float
    var double = 1.23
    var doubleExplict: Double = 4.5
    var float = 1.78F
    var floatExplict: Float = 6.6F

    // boolean
    var bool = true // small t
    var bool2 = false // small f
    var boolExplict : Boolean = true

    // Declaring variable 
    var tinyNum : Byte
    // intialising the variable 
    tinyNum = 1

    // types matter 
    // won't compile
    // var x: Int = 3.12
    // var tinyNum: Byte = 500

    x = 5
    var y = x
    /* won't compile because long reference variable cant point to Int object. 
    But in java, int and long are the primitive therefore it is allowed in java */
    // var z: Long = x
    var z: Long = x.toLong()

    // float to int
    double = 123.456
    y = double.toInt() 
    println("y = $y")

    // array
    var myArray = arrayOf(1, 2, 3)
    println(myArray)
    var arraySize = "myArray has ${myArray.size} items"
    var firstItem = "The first item is ${myArray[0]}"
    println(arraySize)
    println(firstItem)

    var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"
    println(result)


    var myArrayExplict: Array<Byte> = arrayOf(1, 2, 3)

    // wont compile, Array<Int> is not compatible with Array<Byte> with eavh other
    // myArrayExplict = myArray
    // myArray = myArrayExplict

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
}


