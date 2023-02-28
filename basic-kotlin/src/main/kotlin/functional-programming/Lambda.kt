val message = { println("Hello From Lambda") }
val printMessage = { message: String -> println(message) }
val messageLength = { message: String -> message.length }

fun main() {
    message()
    printMessage("Hello From Lambda2")
    println("Message length " + messageLength("Hello From Lambda3"))
}