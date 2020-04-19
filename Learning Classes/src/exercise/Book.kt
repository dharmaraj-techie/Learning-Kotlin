package exercise

    const val MAX_NUMBER_BOOKS = 5

open class Book(val title: String, val author: String, val year: String = "nil") {
    private var currentPage = 1

    companion object  {
        const val BASE_URL = "http://www.turtlecare.net/"
    }

    var hasBooks = 0

    open fun readPage() {
        currentPage++
    }

    fun getTitleAndAuthor() = title to author

    fun getAllDetails() = Triple(title, author, year)

    fun canBorrow() =  hasBooks < MAX_NUMBER_BOOKS

    fun printUrl() {
        //println(Constants.BASE_URL + title + ".html")
    }
}





class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
    fun printDetails(){
        println("Max num of books $MAX_NUMBER_BOOKS")
    }
}