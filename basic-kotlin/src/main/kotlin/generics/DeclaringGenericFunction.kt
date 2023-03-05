/*
public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    //..
}
*/

fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))
}
