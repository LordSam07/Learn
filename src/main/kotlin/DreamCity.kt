fun main(){

    val t = readLine()!!.toInt()

    var calves = arrayListOf(0)
    var exit = 0
    var add = 0

    for  (i in 0 until t) {

        val n = readLine()!!.toInt()

        for (age in 1..n + 1) {

            for (calve in calves.indices) {

                calves[calve] += 1

                if (calves[calve] > n)
                    exit = 1
            }

            if (exit == 1) {
                break
            }else {
                for (calveAge in calves)
                    if (calveAge >= 2)
                        add += 1
            }
            if (add != 0)
                for (k in 0 until add)
                    calves.add(0)
            add = 0
        }
        println(calves.size)
        exit = 0
        calves = arrayListOf(0)
    }
}