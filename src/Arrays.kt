fun main(){

    val a: Array<Int> = arrayOf(4,6,7,8,6,4)
    print(a[4])
    print(a[3])
    print(a[2])

    val name :Array<String> = arrayOf("ali" , "khan"  , "Rehman" ,"basit")

    for (a in 0 until name.size){
        println("name is ${name[a]}")
    }

}