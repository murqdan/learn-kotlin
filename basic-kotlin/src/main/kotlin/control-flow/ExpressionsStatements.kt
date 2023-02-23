fun main() {
    val openOffice = 7 // -> statement
    val now = 8 // -> statement

    if (now > openOffice) // -> statement
        print("Office already open")
    else
        print("Office close")

    val office = if (now > openOffice) "Office already open" else "Office close" // -> expressions

    sum(1 , 1 * 4) // -> expression
}

fun sum(value1: Int, value2: Int) = value1 + value2