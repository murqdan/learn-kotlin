import kotlinx.coroutines.*

// use launch():
/*
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")
}
*/

// canceling job
fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled")
    }
}


