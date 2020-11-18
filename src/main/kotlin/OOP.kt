class Stack{

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

        val cn = top
        top =  top!!.down
        cn!!.down = null
    }

    fun getTop(){
        println("Top : ${top!!.data}")
    }

    fun getAll(){

        var cn = top

        while (cn != null){
            println(cn.data)
            cn = cn.down
        }
    }

}

class SNode(var data: String, var down: SNode?)

fun main(){

    val obj = Stack()
    obj.push("3")
    obj.push("2")
    obj.push("1")
    obj.getAll()
    obj.pop()
    obj.getAll()
    obj.getTop()

}