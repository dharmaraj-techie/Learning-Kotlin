import Aquarium.Fish
import exercise.Book



fun main(args: Array<String>) {

    val book = Book("india", "raj")

    val a = book.getTitleAndAuthor()
    val b = book.getAllDetails()

    val(x,y,z) = b

    println("${a.first} was written by ${a.second}")
    println("${b.first} was written by ${b.second} in the year ${b.third} ")
    println("$x was written by $y in the year $z ")
}
