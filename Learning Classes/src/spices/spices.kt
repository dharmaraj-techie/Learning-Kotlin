package spices


abstract class Spice(val name: String, var spiciness: String = "mild"){
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 5
                "hot" -> 10
                else -> 0
            }
        }

    abstract fun prepareSpice()

    init {
        println("new spice $name with spiciness level of $heat has been created ")
    }
}

interface Grinder {
    fun grind()
    fun test() {
        println("test")
    }
}

interface SpiceColor{
    val color: String
}

object YellowSpiceColor: SpiceColor{
    override val color: String
        get() = "yellow"

}


class Curry(name: String, spiciness: String, spiceColor: SpiceColor = YellowSpiceColor)
    : Spice(name, spiciness), Grinder{
    override fun grind() {
        TODO("Not yet implemented")
    }

    override fun prepareSpice() {
        TODO("Not yet implemented")
    }

    override fun test() {
        println("function from curry")
    }

}




