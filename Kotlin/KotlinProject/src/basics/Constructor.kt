package basics

// primary constructor
class Book(val title: String, val author: String, var price: Int) {
    var message: String = "This is a message."

    // secondary constructors
    constructor(title: String, author: String, price: Int, message: String) : this(title, author, price) {
        this.message = message
        this.price = this.price * 10
    }
}

fun main(args: Array<String>) {
    val hp = Book("Harry Potter", "JK", 20)
    println("Title: ${hp.title}, Author: ${hp.author}, Price: ${hp.price}, ${hp.message}")


    val ho = Book("Harry Otter", "JK", 20, "Hi")
    println("Title: ${ho.title}, Author: ${ho.author}, Price: ${ho.price}, ${ho.message}")

}