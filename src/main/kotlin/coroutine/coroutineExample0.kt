package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {
    val cus1 = "customer1"
    val cus2 = "customer2"

    launch {
        takeOrder(cus1)

        cookingOrder(cus1,2000)

        deliveredOrder(cus1)
    }

    launch {
        takeOrder(cus2)

        cookingOrder(cus2,4000)

        deliveredOrder(cus2)
    }


}

fun takeOrder(name: String) {

    println("taken order from $name")

}

suspend fun cookingOrder(name: String,time: Long) {

    println("cooking order fro $name")
//    Thread.sleep(2000)
    delay(time)

}

fun deliveredOrder(name: String) {
    println("delevered order to  $name")
}
