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

}