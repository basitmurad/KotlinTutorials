fun main(){


    /*
    Functions in Kotlin are reusable blocks of code that perform specific tasks. They can accept input (parameters) and return a value. Kotlin supports top-level functions (defined outside classes) and member functions (defined inside classes).
     */
    rollDice()
    println()
    rollDice(2)
    println()

    rollDice(2,9..19)



}
fun rollDice(){

        val result = (1..6).random()
    println(result)
    }




fun rollDice(times: Int){

    for (i in 0 until times){
        val result = (1..6).random()
        println("Result is $result")
    }

}


fun rollDice(times: Int ,range: IntRange){

    for (i in 0 until times){
        val result = range.random()
        println("Result is $result")
    }

}