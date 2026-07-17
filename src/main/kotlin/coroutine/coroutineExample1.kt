package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(): kotlin.Unit = runBlocking {


//    first()  //sub-routine
//    second() //sub-routine

    launch {
        first()
    }
    launch {
        second()
    }


}


suspend fun first() {

    var i: Int = 0
    while (true) {
        i++
        println("First function running $i")
        delay(2000)


    }
}

suspend fun second() {

    var i: Int = 0
    while (true) {
        i++
        println("Second function running $i")
        delay(4000)
    }
}
