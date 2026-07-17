package coroutine

import kotlin.concurrent.thread

data class User(val name: String, val age: Int)




fun getUser0(onCallback: (User?, Throwable?) -> Unit) {

    thread {
        Thread.sleep(2000)

        try {

            onCallback(User("Abhishek",24),null)


        }catch ( e: Exception )

        {
           onCallback(null,e)
        }


    }


}

fun main() {

    getUser0 { user,e ->

        user.let {
            println(it?.name)
            println(it?.age)
        }

        e?.let {
            println(it.localizedMessage)
        }

    }

}