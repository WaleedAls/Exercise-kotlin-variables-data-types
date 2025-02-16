val sort = { n: Int -> n * 2 }

fun main (){
    val names = mutableListOf( ["Alice", "Bob", "Amir", "Charlie", "Annie", "David"])
    var n = names.map(transformation)
    println(n)
}