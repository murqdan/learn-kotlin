fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Amsterdam"]) // Output: null
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    val mutableCapital = capital.toMutableMap() //it is not recommended to use mutable collections
    mutableCapital.put("Amsterdam", "Netherlands")
}
