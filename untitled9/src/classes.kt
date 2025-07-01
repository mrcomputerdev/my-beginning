
class Car(name: String,var model: String ,var color: String,var doors: Int) {

    var name = name.trim()

    fun move() {
        println("Car ${name} Moves")
    }

    fun stop() {
        println("Car ${name} Stops")
    }
}

class User(var firstName: String, var lastName: String, var age: Int){
    init {
        println("user: $firstName created")
    }
}

class Calculator() {
    companion object{
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}

object  Database{
    init {
        println("Database Created")
    }
}