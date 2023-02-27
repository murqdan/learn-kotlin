class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("murqdan", 22)
    val dataUser = DataUser("murqdan", 22)
    val dataUser2 = dataUser.copy(age = 30)

    println(user)
    println(dataUser)
    println(dataUser2)
    println(dataUser.equals(dataUser2))
}