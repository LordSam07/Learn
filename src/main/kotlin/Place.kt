fun main(args: Array<String>) {

    println("Please enter a string of 10 characters (50% nums AND 50% chars)")
    val str = readLine()!!
    var revStr :String

    if( (str.length <= 10) && (str.length >= 1)){
        println("Valid Output")
        revStr = reverse(str)
        println("Reversed String = $revStr")
        exchange(revStr)
    }else{
        println("Invalid Input")
    }
}

fun reverse(str :String) :String{

    var revStr = ""

    for (i in 9 downTo 0){

        revStr += str[i]
    }

    println(revStr)

    return revStr
}

fun exchange(str :String) {

    val charRep = "z"
    val numRep = "7"
    var output = ""

    for (i in str.indices){

        if (str[i] in 'a'..'z'){
            output += numRep
        }else{
            output += charRep
        }

    }
    println(output)
}