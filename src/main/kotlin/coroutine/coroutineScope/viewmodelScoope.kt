package coroutine.coroutineScope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main () : Unit  = runBlocking{



// Creates a custom coroutine scope with the provided CoroutineContext.
// Useful for managing coroutines with your own Job and Dispatcher.


    val job = Job ()
    val scope = CoroutineScope(job + Dispatchers.IO)
    scope.launch {
        println("")
    }



}
