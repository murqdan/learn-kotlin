fun main() {
    // val numberList : List<Int> = listOf(1, 2, 3, 4, 5)
    val anyList = listOf('a', "Kotlin", 3, true)
    val mutableAnyList = mutableListOf('a', "Kotlin", 3, true)

    mutableAnyList.add('d')
    mutableAnyList.removeAt(0)
}