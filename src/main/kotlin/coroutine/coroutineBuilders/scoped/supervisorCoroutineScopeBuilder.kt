



import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope

fun main(): kotlin.Unit = runBlocking {


    supervisorScope {

        launch { println("supervisor scope first") }
        launch { throw Exception("chud gaye") }
        launch { println("supervisor scope second") }


    }



}