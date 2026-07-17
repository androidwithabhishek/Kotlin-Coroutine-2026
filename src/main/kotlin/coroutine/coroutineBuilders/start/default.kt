package coroutine.coroutineBuilders.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//start: CoroutineStart = CoroutineStart.DEFAULT,


fun main(): kotlin.Unit = runBlocking {


    val job = launch(start = CoroutineStart.UNDISPATCHED, context = Dispatchers.IO) {
        println("Start")

        println(Thread.currentThread().name)
        println(name())
        println(Thread.currentThread().name)
        println("End")
    }




}

suspend fun name(): String {
    delay(2000)
    return "Abhishek"
}