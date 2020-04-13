package Aquarium

class Fish(val friendly: Boolean = true, volumeNeeded: Int){
    private val  size : Int

    init {
        println("first block")
    }

    constructor():this(true, 9){
        println("running secondary constructor")
    }

    init {
        size = if (friendly) volumeNeeded
        else volumeNeeded*2
    }

    init {
        println("constructed fish of size $volumeNeeded final size $size")
    }

    init {
        println("last block")
    }
}
