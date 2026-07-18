package coroutine.coroutineBuilders.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): kotlin.Unit = runBlocking {






    val job  = launch(start = CoroutineStart.LAZY) {

        println("Start")
        println("Abhishek")
        println("End")

    }

    job.start()



}


