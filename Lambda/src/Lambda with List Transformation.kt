import kotlin.math.ln1p

val transformation = { n: Int -> n * 2 }


fun main (){

    val numbers = mutableMapOf(1 to 1, 2 to 2,3 to 3,4 to 4, 5 to 5, 6 to 6,7 to 7,8 to  8,9 to  9,10 to 10)
    val value = (numbers.values)
    println(value)

    for (n1 in numbers) {
        println(n1)
     //   return n1
    }

    println(transformation)

}