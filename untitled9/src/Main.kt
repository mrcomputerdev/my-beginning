//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    val direction = Direction.valueOf("East")

    when (direction) {
        Direction.East -> {
            println("East")
        }

        Direction.West -> println("West")
        Direction.North -> println("North")
        Direction.South -> println("South")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    North("north", 12),
    South("south", 22),
    East("east", 31),
    West("west", 1);

    fun printData() {
        println("Direction = $direction")
        println(" ")
        println("Distance = $distance")
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main(args: Array<String>) {
//    println(Direction.North.direction)
//    println(Direction.North.distance)
//    println(Direction.North.name)
//
//    Direction.West.printData()
//}
//
//enum class Direction(var direction: String, var distance: Int) {
//    North("north", 12),
//    South("south", 22),
//    East("east", 31),
//    West("west", 1);
//
//    fun printData(){
//        println("Direction = $direction")
//        println(" ")
//        println("Distance = $distance")
//    }
//}


//fun main(args: Array<String>) {
//    for(direction in Direction.values()){
//        println(direction)
//    }
//}


//WE DONT DO THIS HERE
//fun main(args: Array<String>) {
//    println(Direction.West)
//    println(Direction.East)
//    println(Direction.North)
//    println(Direction.South)
//}
//
//enum class Direction(var direction: String, var distance: Int) {
//    North("North",12),
//    South("south", 22),
//    East("east",31),
//    West("west", -1)
//}


//fun main() {
//    val user1 = User("Alma", "Gama", 25)
//    val user2 by lazy { User("U1","U2", 0)
//    }
//    println(user2.firstName)
//}
//
//
//class User(var firstName: String, var lastName: String, var age: Int){
//    init {
//        println("user: $firstName created")
//    }
//}

//fun main() {
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//}
//
//object  Database{
//    init {
//        println("Database Created")
//    }
//}


//fun main() {
//
//    val instance1: Database? = Database.getInstance()
//    val instance2: Database? =Database.getInstance()
//    println(instance1)
//    println(instance2)
//}
//
//class Database private constructor() {
//
//    companion object {
//        private var instance: Database? = null
//
//        fun getInstance(): Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//
//            return instance
//        }
//    }
//}


//fun main() {
//    Calculator.sum(5,10)
//    val max = Int.MAX_VALUE
//}
//
//class Calculator() {
//    companion object{
//        fun sum(a: Int, b: Int): Int {
//            return a + b
//        }
//    }
//}


//fun main() {
//    val calculator = Calculator()
//    val result = calculator.sum(1,4)
//    println(result)
//
//}
//
//class Calculator() {
//
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }
//}


//val user = User("Alma", " Zimo ", 0)
//    user.favMovie = "NoBody"
//    println(user.favMovie)