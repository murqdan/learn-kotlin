fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun sets(name: String, vararg number: Int): Int {
    println("$name")
    return number.size
}

fun main() {
    val number = sumNumbers(10,20,30,40)
    println(number)

    val setss = sets("Kotlin", 10,10,10)
    println(setss)

    val number2 = intArrayOf(10,20,30,40)
    sets("Kotlin2", 10, 20, 20, *number2, 10)
}