fun main(){

    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    megaPrime(x, y)
}

fun megaPrime(x: Int, y: Int) {

    val arrayOfMegaPrime = ArrayList<Int>()

    for (i in x..y){
        if (isPrime(i))
            if (isMegaPrime(i))
                arrayOfMegaPrime.add(i)
    }

    printMegaPrime(arrayOfMegaPrime)
}

fun printMegaPrime(arr: ArrayList<Int>) {

    if (arr.size == 0){
        println("No mega prime found!")
    }else{

        for (i in arr){
            print("$i ")
        }
    }
    println()
    print("The sum of mega primes is: ${arr.sum()}")
}

fun isMegaPrime(n: Int): Boolean {

    var isMegaPrime = true

    for (i in n.toString()){
        if (!isPrime(i.toString().toInt())){
            isMegaPrime = false
        }
    }
    return isMegaPrime
}

fun isPrime(n: Int): Boolean {

    var isPrime = true

    for (j in 2 until n){

        if (n % j == 0)
            isPrime = false
    }

    if (n in 0..1)
        isPrime = false

    return isPrime
}
