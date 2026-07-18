package flow.coldFlow

import jdk.internal.net.http.common.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking


fun main(): Unit = runBlocking {
    val flow = flow {
        println("Start")
        repeat(10) {

            delay(2000)
            emit(it)

        }
        println("End")

    }


}
