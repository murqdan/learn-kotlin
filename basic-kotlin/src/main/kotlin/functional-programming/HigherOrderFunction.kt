// var summ: (Int) -> Int = { value -> value + value }

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun main() {
    // printResult(10 ,summ)

    printResult(10){value ->
        value + value
    }

    printResult(20){value ->
        value + value
    }
}