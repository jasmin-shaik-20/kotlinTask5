fun main(args: Array<String>)
{
    println(Display.name)
    println("The answer of addition is ${Display.add(3,2)}")
    println("The answer of addition is ${Display.add(10,15)}")
}

object  Display
{
    init
    {
        println("Singleton class invoked.")
    }

    var name = "hlo"
    fun add(num1:Int,num2:Int):Int
    {
        return num1.plus(num2)
    }
}