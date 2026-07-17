package coroutine.coroutineBuilders.start

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//start: CoroutineStart = CoroutineStart.DEFAULT,


fun main(): kotlin.Unit = runBlocking {



val job =  launch(start = CoroutineStart.LAZY) {
    println(name())

}
job


}

suspend fun name(): String {
    delay(2000)
    return "Abhishek"
}