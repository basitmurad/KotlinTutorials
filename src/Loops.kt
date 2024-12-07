fun main(){


    val  g:IntArray = intArrayOf(4,5,6,7,8,9,1,2,4)
    /*
     while Loop
Repeats as long as a condition is true.
     */
    println()
    var a= 1
    while (a<=9){
        print ("$a , ")
        a+=1
    }

    /*
    do-while Loop
Executes the block of code at least once before checking the condition.
     */

    println()
    var b = 2 // Initialize `b` with a starting value

    do {
        print("$b , ") // Print the current value of `b`
        b += 2         // Increment `b` by 2
    } while (b <= 9)    // Use `b` in the condition


    /*
    for Loop
Used to iterate over a range, collection, or array.
     */

        println()
        for (x in 1..10 ){


            print("$x ,")

        }

    for (y in g.indices){
        print(g[y])
    }
}