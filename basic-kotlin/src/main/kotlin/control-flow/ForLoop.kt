fun main() {
    /*val ranges = 1..10 step 2
    for(i in ranges){
        println("value is $i")
    }*/

    val ranges = 1.rangeTo(10)
    for((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }


}