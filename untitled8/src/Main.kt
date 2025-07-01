fun main(args: Array<String>) {
    val user = User("Antonio", "zinjy", 300)

        user.favMovie = "The God Father"
    println(user.favMovie)
}


class User(firstName: String, var LastName: String, var age: Int) {
    lateinit var favMovie: String
}















////Getters and Setters
//fun main(args: Array<String>) {
//    val user = User("Antonio")
//    val friend = User(firstName = "John", LastName = "Makal")
//    val user2 = User(age = 51 , LastName =  "Shwarts" ,firstName =  "Jakal")
//    println("\n")
//
//    user.firstName = "Vlad"
//
//    println("Name is ${user.firstName}")
//    println("Name is ${user.LastName}")
//    println("Name is ${user.age}")
//    println("\n")
//    println("Name is ${friend.firstName}")
//    println("Name is ${friend.LastName}")
//    println("Name is ${friend.age}")
//    println("\n")
//
//}
//
//class User(firstName: String, var LastName: String = "LAst Name", var age: Int= 0){
//    var firstName = firstName
//        get() = field
////                 {    return "FirstNamed: $field"         }
//        set(value) {
////            println("$value was assigned to FirstName Proberty")
//            field  = value
//        }
//
//
//}


//fun setFirstName(newValue: String){
//    this.firstName = newValue
//}
//fun getFirstName(): String{
//    return this.firstName
//}


//fun main() {
//    val user = User("Antonio")
//    val friend = User(FirstName = "John", LastName = "Makal")
//    val user2 = User(age = 51 , LastName =  "Shwarts" ,FirstName =  "Jakal")
//    println("\n")
//    println("Name is ${user.FirstName}")
//    println("Name is ${user.LastName}")
//    println("Name is ${user.age}")
//    println("\n")
//    println("Name is ${friend.FirstName}")
//    println("Name is ${friend.LastName}")
//    println("Name is ${friend.age}")
//    println("\n")
//
//}
//
//class User(var FirstName: String, var LastName: String = "LAst Name", var age: Int= 0){
//
//
//
//}


//fun main() {
//    val user = User("Antonio")
//    val friend = User("juDi", "Makal")
//    println("\n")
//    println("Name is ${user.name}")
//    println("Name is ${user.LastName}")
//    println("Name is ${user.age}")
//    println("\n")
//    println("Name is ${friend.name}")
//    println("Name is ${friend.LastName}")
//    println("Name is ${friend.age}")
//    println("\n")
//
//}
//
//class User(var name: String, var LastName: String, var age: Int){
//
//    constructor(name: String): this(name, "Umal", 0){
//        println("2")
//    }
//
//    constructor(name: String, LastName: String):this(name, LastName, 0){
//        println("3")
//
//    }
//
//}


//fun main() {
//    val user = User("Antonio", "Montana", 21)
//    val friend = User("juDi", "Krimson", 51)
//
//    println("Her Name ${friend.name}")
//}
//
//class User(name: String, var LastName: String, var age: Int){
//    var name: String
//
//    init {
//        if(name.lowercase().startsWith("a")){
//            this.name = name
//        }else{
//            this.name = "User"
//            println("No A")
//        }
//    }
//}


//    car1.name = "Tofas"
//    car1.color= "Red"
//    car1.model= "2003"
//    car1.doors = 4
//    car2.name = "Mitsubishi"
//    car2.model = "Crystal"
//    car2.color = "Green"
//    car2.doors = 4
//    var name = ""
//    var model = ""
//    var color = ""
//    var doors = 0





