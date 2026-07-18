package coroutine.coroutineContext

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.concurrent.thread

fun main(): kotlin.Unit = runBlocking {

    val nameReturn = withContext(Dispatchers.IO) {
        println("This is running on : ${Thread.currentThread().name}")
        return@withContext "ABHISHEK"
    }



    println(nameReturn)

}

