/*
// slice
fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)
}
*/

// distinct
/*
fun main() {
    */
/*val total = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)*//*


    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }
}*/

// chunked
fun main() {
    val word = "LOVE"
    val chunked = word.chunked(2)

    println(chunked)

    val chunkedTransform = word.chunked(2) {
        it.toString().lowercase()
    }

    println(chunkedTransform)
}