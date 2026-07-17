import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope


// context: CoroutineContext = EmptyCoroutineContext,
// start: CoroutineStart = CoroutineStart.DEFAULT,
// block: suspend CoroutineScope.() -> Unit

fun main(): kotlin.Unit = runBlocking {

supervisorScope {
    val dispatchersIO = Dispatchers.IO


    val job = Job()


    val exceptionHandler = CoroutineExceptionHandler { context, exception ->

        println(exception.message)
    }

    val coroutineContext = dispatchersIO + exceptionHandler


    launch(context = coroutineContext) {
        throw Exception("CHUD GAY")
    }
}



}

