fun main() {
    val text: String? = null
    text?.length

    val text2: String? = null
    val text2Length = text2?.length ?: 7
}