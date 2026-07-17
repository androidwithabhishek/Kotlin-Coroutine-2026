
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//runBlocking , launch , async stand along coroutine builders


fun main() {

    println("Start..")



    runBlocking {

        val job0 = launch {
            println(getCameraLensInfo("CANON", 50, 2000))
        }


//        job0.join()

        val job1 = launch {
            println(getCameraLensInfo("NIKON", 85, 2000))
        }
//        job1.join()

//        println(job0)
//        println(job1)
    }



    println("End:")
}


suspend fun getCameraLensInfo(brand: String, focalLength: Int, delay: Long): String {

    delay(delay)
    return brand


}