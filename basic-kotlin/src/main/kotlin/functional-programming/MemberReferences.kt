fun isEvenNumber(number: Int) = number % 2 == 0
fun Int.isEvenNumber2() = this % 2 == 0

fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    val evenNumbers2 = numbers.filter(Int::isEvenNumber2)
    println(evenNumbers2)
}

