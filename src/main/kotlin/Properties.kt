class Employee()
{

    //declaring properties
     var name:String="jasmin"
    var email:String="jasmin@gmail.com"
    var phoneno:Long=9390547915

}

//getters and setters
class Company {
    var name: String = ""
        get() = field
        set(value) {
            field = value
        }
}

fun main()
{
    var result=Employee()
    println(result.name)
    println(result.email)
    println(result.phoneno)



    val c = Company()
    c.name = "msf"
    println(c.name)
}
