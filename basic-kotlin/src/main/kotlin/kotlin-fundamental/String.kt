fun main() {
    var text = "Kotlin"
    var firstChar = text[0]
    println("First character of $text is $firstChar")

    for(char in text) {
        print("$char ")
    }

    print("\n")

    val name = "Unicode test: \u00A9"
    println(name)

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    print(line)
}