fun main () {
    val capitals = mutableMapOf("USA" to "washington", "France" to "Paris", "Germany" to "Berlin")

    capitals["Kuwait"]= "Kuwait"

   println ("Countries : " + capitals.map { it.key })
    println ("Capitals : " + capitals.map { it.value })
    println("Final MAP : " + capitals)
}