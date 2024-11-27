fun main(){




    /*
In Kotlin, var and val are used to declare variables:

var is used for mutable variables, meaning the value can be changed after initialization.
val is used for immutable variables, meaning the value cannot be reassigned once it's set.

   The println() function uses string interpolation to insert the values of name and age into the string.





     */
    val name : String  = "Basit "
    var age : Int = 10

    println(age)
    age = 34

    println(name)
    println(age)


    println("Name is $name and age is $age")



    /*
    Kotlin's null safety feature is designed to eliminate the risks of null pointer exceptions, which are common in many programming languages. Here's a brief explanation:

1. Nullable Types
In Kotlin, by default, all types are non-nullable. If you want to allow a variable to hold null, you must explicitly declare it as nullable by appending a ? to the type:
     */


    var language: String? = null  // Nullable String
    var grade: String? = null  // Nullable String

    println(language)

    language = "kotlin"

    println(language)


    println(" ${grade?.length }")

}