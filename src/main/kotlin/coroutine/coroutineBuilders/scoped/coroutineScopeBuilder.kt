package coroutine.coroutineBuilders.scoped

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): kotlin.Unit = runBlocking {


    coroutineScope {

        launch { println("coroutine scope first") }


        launch { println("coroutine scope second") }
    }



}