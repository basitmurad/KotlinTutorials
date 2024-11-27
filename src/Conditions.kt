
val firstName: String = "Basit"
var lastName: String? = null;
val age : Int = 23

fun main(){


    /*
    In Kotlin, conditional statements are used to make decisions based on certain conditions. Kotlin provides several ways to work with conditions, including if, else, and when statements.
     */

//    lastName = "Murad"

    if (lastName!=null){
        println("Your name is $firstName $lastName")
    }
    else if( lastName==null){
        println("Your name is $firstName $lastName and age is $age")
    }
    else{
        println("Name is not valid")
    }


    /*
    when multiple condition we can you when

In Kotlin, the when statement is a powerful control flow structure that allows you to check a value against multiple possible conditions, similar to a switch statement in other languages like Java. It is more flexible and can handle a variety of situations such as checking ranges, conditions, or even arbitrary expressions.
     */

    var grade: Int? =null
    grade = readLine()?.toIntOrNull()

    when(grade){
        5 -> {
println("You are student of 5th grade")
        }
        6 -> {
            println("You are student of 6th grade")
        }
        7 -> {
            println("You are student of 7th grade")
        }
        8 -> {
            println("You are student of 8th grade")
        }
        else -> println("Invalid")
    }

}

