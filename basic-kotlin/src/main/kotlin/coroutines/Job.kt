import kotlinx.coroutines.*

// use launch():
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")
}


