package coroutine.coroutineBuilders.standAlon

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main(): Unit = runBlocking {

    println("Start..")
    val deferred = async {

        getCarInfo("Maruti", 2000)

    }

    delay(3000)

    println(deferred.getCompleted())

    println("End:")

}

suspend fun getCarInfo(brand: String, delay: Long): String {

    delay(delay)
    return brand


}