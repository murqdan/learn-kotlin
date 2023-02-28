fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun getFullName2(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main(){
    val fullName = getFullName(middle = " is " , first = "life", last = "beautiful")
    println(fullName)

    val fullNameDefault = getFullName2()
    println(fullNameDefault)
}