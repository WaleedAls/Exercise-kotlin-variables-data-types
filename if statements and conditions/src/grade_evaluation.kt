fun main () {

    var score: Int = 77


    if ( score >= 90){
      println("Grade: A")

    } else if  (score >= 80 && score <= 89) {
        println("Grade: B")
    } else if ( score >= 70 && score <= 79 ) {
        println("Grade: C")
    }else if ( score >= 60 && score <= 69 ) {
        println("Grade: D")
    } else {
        println("Grade: F")
    }

}