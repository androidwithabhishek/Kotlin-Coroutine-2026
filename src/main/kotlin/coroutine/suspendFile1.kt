package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun getUser1(onCallback: (User?, Throwable?) -> Unit) {
    println("Start...")
    delay(2000)
    delay(2000)
    delay(2000)
    try {
        onCallback(User("Vibhuti", 40), null)
    } catch (e: Exception) {
        onCallback(null, e)
    }


}


fun main() {


//    runBlocking is nothing but a Coroutine Builder

   runBlocking {


            getUser1 { user, e ->

                println(user?.name)
                println(user?.age)
                println(e)
            }




    }


}