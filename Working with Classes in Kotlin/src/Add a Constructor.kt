class Book(var title: String, var author: String,var yearOfPublisher: Int) {

    fun getBookInfo (){
       println( "Title by Author ($yearOfPublisher)")
    }
    /* var title: String = ""
     var author: String = ""
     var publisher: String = ""

     */
}

fun main () {
    var myBook = Book("Hello World","Michael Jackson",2025)
  /*  myBook.title = "Hello World"
    myBook.author = "Michael Jackson"
    myBook.publisher = "Michael Jackson"
*/
    println(myBook)
    println(myBook.getBookInfo())
}


