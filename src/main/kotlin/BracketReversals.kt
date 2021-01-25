import kotlin.math.ceil

class Stack2 {

    var top: SNode? = null

    fun push(data: String){

        val newNode = SNode(data, null)

        if (top == null){
            top = newNode
            return
        }

        newNode.down = top
        top = newNode
    }

    fun pop(){

        if (top == null){
            println(" Stack is empty")
        }else{
            val cn = top
            top = top!!.down
            cn!!.down = null
            println("Popped : ${cn.data}")
        }
    }

    fun getAll(){
        var cn = top

        while (cn != null){
            println("[${cn.data}]")
            cn = cn.down
        }
    }

    fun top(){
        println("Top : ${top!!.data}")
    }
}

fun main(){

    val str = "{{}}}}"

    bracketReversals(str)
}

fun bracketReversals(str: String) {

    val stack = Stack2()

    if (str.length % 2 != 0){
        println("Can't balance given expression")
    }else{

        for (i in str){

            if ((i == '}') && (stack.top !=  null)){
                if (stack.top!!.data != "{"){
                    stack.push(i.toString())
                }
            }
            else if ((i == '}') && (stack.top !=  null)){
                if (stack.top!!.data == "{"){
                    stack.pop()
                }
            }
            else {
                stack.push(i.toString())
            }
        }

        if (stack.top == null){
            println("Expression is balanced")
        }else{

            var ref = stack.top
            var m = 0
            var n = 0

            while (ref != null){

                if (ref.data == "{")
                    m++
                if (ref.data == "}")
                    n++

                ref = ref.down
            }

            println("Reversals needed to balance the expression: ${ceil(m.toDouble()) + ceil(n.toDouble())}")
        }
    }
}
