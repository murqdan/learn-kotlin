val Int?.slice: Int
    get() = this?.div(2) ?: 0

fun main() {
    val value: Int? = null
    println(value.slice)
}