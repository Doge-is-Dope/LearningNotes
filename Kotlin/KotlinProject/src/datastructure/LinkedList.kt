package datastructure

class Element(val value: Int, var next: Element?)

class LinkedList(private val head: Element) {
    fun append(element: Element) {
        var current = this.head
        while (current.next != null) {
            current = current.next!!
        }
        current.next = element
    }

    fun getPosition(position: Int): Element? {
        var currentIndex = 1
        var current = this.head
        if (position < 1) return null
        while (current.next != null) {
            currentIndex++
            current = current.next!!
            if (currentIndex == position) {
                return current
            }
        }
        return current
    }

    override fun toString(): String {
        var s = "${this.head.value}"
        var current = this.head
        while (current.next != null) {
            s += " -> ${current.next!!.value}"
            current = current.next!!
        }
        return s
    }
}

fun main() {
    val e1 = Element(1, null)
    val e2 = Element(2, null)
    val e3 = Element(3, null)

    val ll = LinkedList(e1)
    print(ll.getPosition(0)?.value)
    ll.append(e2)
    ll.append(e3)

//    print(ll.getPosition(2)?.value)
//    print(ll.getPosition(3)?.value)
//    print(ll)
}