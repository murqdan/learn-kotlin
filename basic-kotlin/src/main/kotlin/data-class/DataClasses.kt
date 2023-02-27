class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val user = User("murqdan", 22)
    val dataUser = DataUser("murqdan", 22)
    val dataUser2 = dataUser.copy(age = 30)

    println(user)
    println(dataUser)
    println(dataUser2)
    println(dataUser.equals(dataUser2))

    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, I am $age years old")
    //or
    val(name2, age2) = dataUser2
    println("My name is $name2, I am $age2 years old")

    dataUser.intro()
}