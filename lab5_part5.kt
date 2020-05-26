open class Person(age: Int, name: String){
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person(age, name) {

    fun teachMaths() {
        println("I teach high school calculus.")
    }
}

class Footballer(age: Int, name: String, club: String): Person(age, name) {
    init {
        println("I play for $club")
    }
    fun playFootball() {
        println("I am playing football")
    }
}

class Businessman(age: Int, name: String): Person(age, name) {
    fun runBusiness() {
        println("I run the company Apple.")
    }
}

fun main() {
    val t1 = MathTeacher(37, "Ashley")
    t1.teachMaths()

    println()

    val f1 = Footballer(32, "Marcelo Vieira", "Real Madrid")
    f1.playFootball()

    println()

    val b1 = Businessman(59, "Tim Cook")
    b1.runBusiness()
}