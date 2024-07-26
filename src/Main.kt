fun main(){
    val isBlank = true
    println(isBlank.not())
    println(isBlank)
    println("".isBlank())

    // arithmetic operators: + - * / %
    // assignment operators: += -= *= /= %=
    /*
    unary plus +
    unary minus -
    not !
    increment ++
    decrement --
    prefix ++a
    postfix a++
     */
    var a = 3
    var b = 2

    b = a++
    println(a)
    println(b)
    println(a)
    println(b)
    // prefix make add to a and b variable but postfix make add to a variable only.
    val num = b
    println(num)

    // comparison operators > < >= <= == !=
    // if and if else and else if expressions
    val test = 6
    if(test > 7){
        println("true")}
    else {
        println("false")
    }
    // if else in one line
    val integer = 53
    if(integer > 35) println("your number is greater than 35") else println("your number is less than 35")
}
