// run
/*fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}*/

// with
/*fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
}*/

// apply
fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}