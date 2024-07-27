fun main(){
    // Boolean operators  || ==> OR  && ==> AND  ! ==> NOT operator
    /*
    Structural equality
    equality ==> == or .equals()
    inequality ==> !=
     */
    /*
    Referential equality: Two references point to the same object
    === and !==
     */

    class Persons(var name:String)

    val obj1 = Persons("Ahmed")
    val obj2 = Persons("Mahmoud")

    if(obj1 !== obj2){
        println("True")
    }else{
        println("False")
    }

    println("========================")

    //When expression
    val x = 44

    when(x){
        40 -> println("X == 40")
        else -> println("X != 40")
    }

    when{
        (x == 44) -> println("X == 44")
        else -> println("X != 44")
    }
}