package coroutine.job

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {


    val job = launch(start = CoroutineStart.LAZY) {


        for (i in 1..4) {
            println("this is $i")
            delay(300)

        }


    }

    job.invokeOnCompletion { e ->

        e?.let {

            println(e.message)


        } ?: run {


            println("this is invoke on completion")

        }


    }

    println("DONE")


}