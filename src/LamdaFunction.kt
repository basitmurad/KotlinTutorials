import kotlin.concurrent.thread

fun main() {
//    rollDice(range = 1..6, time = 6) { result ->
//        println(result)
//    }

    val  result= rollDice {}
    println(result)
}

fun rollDice(range: IntRange, time: Int, callback: (result: Int) -> Unit) {
    for (i in 0 until time) {
        val result = range.random()
        callback(result)
    }


}
fun rollDice(callback: (result: Int) -> Unit) : String{

    thread {
        Thread.sleep(
            3000
        )
        callback(4)
    }
    return "Dice Rolled"
}
