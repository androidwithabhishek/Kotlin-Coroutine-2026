package flow.hotflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): kotlin.Unit = runBlocking {


    val hotFlow = MutableSharedFlow<Int>()

    val job1 = launch() {
        hotFlow.collect {
            println("Fist Collector -> $it")


        }
    }


    val job2 = launch() {
        delay(300)
        hotFlow.collect {
            println("Second Collector -> $it")
        }
    }

    launch {
        repeat(10) {

            delay(100)
            hotFlow.emit(it)
        }
    }


}