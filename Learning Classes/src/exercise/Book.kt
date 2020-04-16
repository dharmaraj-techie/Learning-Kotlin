package exercise

open class Book(val title: String, val author: String, val year: String="nil") {
     private var currentPage = 1



    open fun readPage(){
        currentPage++
    }

    fun getTitleAndAuthor() = title to author
    fun getAllDetails() = Triple(title,author,year)



}
class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}