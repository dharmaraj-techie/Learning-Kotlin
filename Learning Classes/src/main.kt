import Aquarium.Fish
import exercise.Book
import exercise.Book.Companion.BASE_URL

import exercise.eBook


fun main(args: Array<String>) {

    val book = eBook("india", "raj")

    val a = book.getTitleAndAuthor()
    val b = book.getAllDetails()

    val(x,y,z) = b

    println("${a.first} was written by ${a.second}")
    println("${b.first} was written by ${b.second} in the year ${b.third} ")
    println("$x was written by $y in the year $z ")

    book.printDetails()


}
