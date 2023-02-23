fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun printUser(name: String) {
    print("Your name is $name")
}

fun main() {
    println(setUser("Osas", 30))

    printUser("Osas")
}