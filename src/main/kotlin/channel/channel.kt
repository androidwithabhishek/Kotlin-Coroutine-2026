package flow.channel

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consume
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {


    val channel = Channel<Int>()

    launch {
        channel.send(1)
        channel.send(2)
    }

    val job = launch(start = CoroutineStart.LAZY) {

        println(" Consumer1-> ${channel.receive()}")
        println(" Consumer2-> ${channel.receive()}")

    }

//    job.start()

    val channe2 = Channel<Int>(
        capacity = 3,
        onBufferOverflow = BufferOverflow.DROP_OLDEST,
        onUndeliveredElement = {
            println("Undelivered value element ->$it")
        })

    launch {

        repeat(10) {
            println("Sending $it")
            channe2.send(it)
        }
    }


    launch {

        repeat(10) {
            delay(1)
            println("Receive   ${channe2.receive()}")
        }


    }

//    println(Channel.BUFFERED)


}