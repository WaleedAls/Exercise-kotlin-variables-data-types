fun main(){

    val numbers = arrayListOf<Int>(10,5,20,15,25,30)

    val sortedNumbers = numbers.sorted()

    println("Sorted List:" +sortedNumbers )

    val filteredNumbers = numbers.filter { it > 15 }
    println("Numbers greater than 15:" + filteredNumbers)


}