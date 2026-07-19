package flow.hotflow

import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val sharedFlow = MutableSharedFlow<Int>(
        replay = 0,
        extraBufferCapacity = 0,
        onBufferOverflow = BufferOverflow.SUSPEND
    )

    launch {

        sharedFlow.collect {
            delay(1000)
            println("fist collector -> $it")
        }

    }


    launch {

        repeat(10) {
            println("repeat value - >$it")
            sharedFlow.emit(it)
        }


    }


//    launch {
//        delay(5000 )
//
//        sharedFlow.collect {
//            println("second collector -> $it")
//        }
//    }


}