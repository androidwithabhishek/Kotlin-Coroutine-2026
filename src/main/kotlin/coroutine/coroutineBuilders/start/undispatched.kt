package coroutine.coroutineBuilders.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main (): Unit = runBlocking{
    val job  = launch(start = CoroutineStart.UNDISPATCHED, context = Dispatchers.IO) {

        println("Start ${Thread.currentThread().name}")
        delay(2000)
        println("Abhishek")
        println("End ${Thread.currentThread().name}")

    }




}
