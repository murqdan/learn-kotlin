fun main() {
    fun factorial(n: Int): Int {
        return if (n == 1) {
            n
        } else {
            n * factorial(n - 1)
        }
    }

    println(factorial(3))
}