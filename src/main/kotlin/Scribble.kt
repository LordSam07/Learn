fun main(){

    val factorial = fact(5)
    print(factorial)
}

fun fact(n: Int): Int{

    var fact = 1

   for (i in 1..n)
       fact *= i

    return fact
}