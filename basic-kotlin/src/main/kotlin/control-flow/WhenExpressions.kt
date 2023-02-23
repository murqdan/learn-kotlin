import kotlin.random.Random

fun main() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    print(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)
