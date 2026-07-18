package coroutineScope

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main (): kotlin.Unit = runBlocking {

//    exist for the lifetime of the application.

    GlobalScope.launch {


        delay(1000)

        println("This is last line")

    }

    Thread.sleep(2000)


}


