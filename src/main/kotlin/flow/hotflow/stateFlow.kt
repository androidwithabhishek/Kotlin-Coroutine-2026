package flow.hotflow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {



    val stateFlow = MutableStateFlow<Int>(0)






    launch {

        repeat(10) {
            delay(100)
            stateFlow.emit(it)
        }


    }

    launch {

        stateFlow.collect {

            println("First collector -> $it")
        }
    }


    launch {
       delay(2000)
        stateFlow.collect {

            println("Second collector -> $it")
        }
    }
}