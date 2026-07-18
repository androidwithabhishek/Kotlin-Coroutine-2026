package coroutine.coroutineContext

import coroutine.coroutineBuilders.standAlon.runBlockingCoroutineBuilder
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope
import kotlin.math.E


fun main(): Unit = runBlocking {


    val disp = Dispatchers.IO

    val exceptionHandler = CoroutineExceptionHandler { context, throwable ->

        println(throwable.message)
    }


    supervisorScope {

        val coroutineContext = disp + exceptionHandler

        launch(context = coroutineContext) {


            throw Exception("Lodaaaaaa")
        }
    }



}