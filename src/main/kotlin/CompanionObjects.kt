class Person {
    companion object {
        var num=3
        fun callMe() {
            println("I'm called.")
        }
    }
}

fun main(args: Array<String>) {

    Person.callMe()
    println(Person.num)
}
