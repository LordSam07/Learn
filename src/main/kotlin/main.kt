class LinkedList {

    var head: Node? = null

    val length: Int
        get() {
            var cn = head
            var count = 0

            while (cn != null) {
                count++
                cn = cn.next
            }
            return count
        }

    private val lastNode: Node?
        get() {
            var cn = head

            while (cn!!.next != null)
                cn = cn.next

            return cn
        }

    fun addFront(data: String) {

        val newNode = Node(data, null)

        if (head == null) {
            head = newNode
            return
        }

        newNode.next = head
        head = newNode
    }

    fun addLast(data: String) {

        val newNode = Node(data, null)

        if (head == null) {
            head = newNode
            return
        }

        lastNode!!.next = newNode
    }

    fun addBefore(index: Int, data: String) {

        val newNode = Node(data, null)

        var before = head
        repeat(index - 2) {
            before = before!!.next
        }

        var after = head
        repeat(index - 1) {
            after = after!!.next
        }

        before!!.next = newNode
        newNode.next = after

    }

    fun deleteTail() {
        var cn = head

        repeat(length - 2) {
            cn = cn!!.next
        }
        cn!!.next = null
    }

    fun deleteHead() {
        val cn = head
        head = head!!.next
        cn!!.next = null
    }

    fun deleteAt(index: Int) {

        var cn = head

        repeat(index - 2) {
            cn = cn!!.next
        }
        cn!!.next = cn!!.next!!.next
    }

    fun delete(data: String) {

        var cn = head
        var count = 1

        while (cn!!.data != data) {
            count++
            cn = cn.next
        }
        deleteAt(count)
    }

    fun sort() {

        var cn = head

        for (i in 1 until length) {
            while (cn!!.next != null) {
                if (cn.data > cn.next!!.data) {
                    val temp = cn.data
                    cn.data = cn.next!!.data
                    cn.next!!.data = temp
                }
                cn = cn.next
            }
            cn  = head
        }
    }

    fun getAll() {

        var cn = head

        while (cn != null) {
            print("[${cn.data}]")
            cn = cn.next
        }
    }
}

class Node(var data: String, var next: Node?)

fun main() {

    val list = LinkedList()

    list.addLast("4")
    list.addLast("5")
    list.addLast("2")
    list.addLast("3")
    list.addLast("1")
    list.addFront("0")
    list.addFront("100")
    list.deleteHead()
    list.deleteTail()
    list.addBefore(4, "7")
    list.deleteAt(4)
    list.delete("7")
    println(list.length)
    list.getAll()
    list.sort()
    println()
    list.getAll()


}