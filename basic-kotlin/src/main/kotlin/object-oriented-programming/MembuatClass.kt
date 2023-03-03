class Animal( // class
    val name: String, // properties
    val weight: Double,
    val age: Int,
    val isMammal: Boolean
) {
    fun eat() { // function
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val cat = Animal("Kuma", 4.2, 2, true) // object

    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, Mamalia: ${cat.isMammal}")
    cat.eat()
    cat.sleep()
}