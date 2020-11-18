class Queue {

    private var head: QNode? = null
    private var tail: QNode? = null

    fun enqueue(data: String){

        val newNode = QNode(data, null)

        if (head == null){
            head = newNode
            tail = newNode
            return
        }

        tail!!.next = newNode
        tail = tail!!.next
    }

    fun dequeue(){
        val cn = head
        println("Dequeue : ${head!!.data}")
        head = head!!.next
        cn!!.next = null
    }

    fun getAll(){

        var cn = head

        while (cn != null){
            print("[${cn.data}]")
            cn = cn.next
        }
    }
}

class QNode(val data: String, var next: QNode?)

fun main(){

    val queue = Queue()

    queue.enqueue("Sam")
    queue.enqueue("is")
    queue.enqueue("cool")
    queue.getAll()
    println()
    queue.dequeue()
    queue.getAll()
}