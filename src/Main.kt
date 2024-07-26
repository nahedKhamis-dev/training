fun main (){
    // this statment to print line
    /* this statment to
    print /* statment */
    in new line */
    print("hello world!")
    println("hello world!")
    println("hello world!")
    println("hello")

    var firstName = "nahed"
    firstName = ""
    println(firstName)
    println(firstName.isEmpty())


    val number:Char = '1'
    //number = 66
    // 'Char class', "String class"
    println(number)
    println(number::class)

    /*
    integer types is:
    Byte 8 bytes
    Short 16 bytes
    Int 32 bytes
    Long 64 bytes

    decimal types is:
    Float 32 bytes
    Double 64 bytes
    */

    // how to convert data type such as toLong()
    // functions in kotlin suchas plus, minus, times, div

    val num:Int = 5
    val newNum: Int = num.minus(20)
    println(newNum)

    val str:String = "Nahed Khamis"
    println(str.uppercase())
    println(str.lowercase())

    print("Hello World\nWelcome")

    // trivial quotes used to write string in multi lines
    val statement:String = """
    Hello,
    My name is nahed,
    are you okey?
    """
    println(statement)

    // to delete indentation use .trimIndent()
    println(statement.trimIndent())

    //to replace indentation use .replaceIndent()
    println(statement.replaceIndent("- "))

    //to delete character from statement use trimMargin()
    val state:String = """
    >> Hello,
    >> My name is nahed,
    >> are you okey?
    """
    println(state.trimMargin(">>"))
    val name:String = "mohammed"
    val age:Int = 24
    val string:String = "My name is $name and age is $age and your name is ${name.length} characters long"
    // or you can use concatenation as "my name is " + name + " and age is " + age
    println(string)
    println(name.length)
}