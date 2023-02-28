// extensions funtions
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

// extensions properties
val Int.slice: Int
    get() = this / 2

fun main() {
    10.printInt()
    println(10.plusThree())

    println(10.slice)
}