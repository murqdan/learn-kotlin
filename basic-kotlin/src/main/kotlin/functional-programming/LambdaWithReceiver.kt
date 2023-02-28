fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    val message = buildString {
        append("Hellow ")
        append("from ")
        append("lambda ")
    }

    println(message)
}