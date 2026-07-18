package coroutine.coroutineContext

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(): kotlin.Unit = runBlocking {


    launch(context = Dispatchers.IO) {
        println("first" + " : " +Thread.currentThread().name )
    }
    launch() {
        println("first" + " : " +Thread.currentThread().name )
    }
    launch(context = Dispatchers.Default) {
        println("first" + " : " +Thread.currentThread().name )
    }
    launch(context = Dispatchers.Unconfined) {

        println("first" + " : " +Thread.currentThread().name )
        delay(2000)
        println("second" + " : " +Thread.currentThread().name )

    }

}