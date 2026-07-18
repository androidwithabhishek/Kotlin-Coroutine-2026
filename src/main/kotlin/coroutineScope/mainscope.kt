package coroutineScope

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main (): kotlin.Unit = runBlocking {

//    Used for UI-related work. Cancel it when the owner (Activity, Fragment, etc.) is destroyed.

    MainScope().launch {


        delay(1000)

        println("This is last line")

    }

    Thread.sleep(2000)


}
