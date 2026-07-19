package flow.coldFlow

import jdk.internal.net.http.common.Log
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(): Unit = runBlocking {

    val flow = flow {


        println("Start")
        repeat(10) {

            delay(100)
            emit(it)

        }
        println("End")
        7

    }

    val job1 = launch(start = CoroutineStart.LAZY) {

        flow.collect {
            println("first collector -> $it")
        }

    }



    val job2 = launch(start = CoroutineStart.LAZY) {
        flow.collect {
            println("second collector -> $it")
        }

    }

    job1.start()
    delay(2000)
    job2.start()
    println(flow.toString())



}
