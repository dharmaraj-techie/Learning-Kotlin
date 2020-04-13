package spices


class SimpleSpice(){
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5 }
}
class Spice(val name: String, var spiciness: String = "mild"){
    val heat: Int
        get() {
            return when(spiciness){
                "mild" -> 5
                "hot" -> 10
                else -> 0
            }
        }
    init {
        println("new spice $name with spiciness level of $heat has been created ")
    }
}
fun makeSalt() = Spice("salt", "mild")


