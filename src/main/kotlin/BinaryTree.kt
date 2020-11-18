class BinaryTree {

    var root: BNode? = null

    fun inOrder(node: BNode?){

        if (node == null)
            return

        inOrder(node.lChild)
        print("[${node.data}] ")
        inOrder(node.rChild)
    }

    fun preOrder(node: BNode?){

        if (node == null)
            return

        print("[${node.data}] ")
        preOrder(node.lChild)
        preOrder(node.rChild)
    }

    fun postOrder(node: BNode?){

            if (node == null)
                return

            postOrder(node.lChild)
            postOrder(node.rChild)
            print("[${node.data}] ")
    }
}

class BNode(var data: Int, var lChild: BNode? = null, var rChild: BNode? = null)// default arguments/parameters

fun main(){

    val tree = BinaryTree()

    tree.root = BNode(1)
    tree.root!!.lChild = BNode(2)
    tree.root!!.rChild = BNode(3)
    tree.root!!.lChild!!.lChild = BNode(4)
    tree.root!!.lChild!!.rChild = BNode(5)
    tree.root!!.rChild!!.lChild = BNode(6)
    tree.root!!.rChild!!.rChild = BNode(7)

    tree.inOrder(tree.root)
    println()
    tree.preOrder(tree.root)
    println()
    tree.postOrder(tree.root)
}