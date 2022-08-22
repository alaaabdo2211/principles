package eu.tutorials.oopexample.models.polymorphism

class Maximum {

fun main() {
    println("This is 1st methods max 1 : ${getMax(2, 3)}")
    println("This is 1st methods max 3 : ${getMax(6.4, 3)}")
    println("This is 1st methods max 2 : ${getMax(2.4, 3.4)}")
    println("This is 1st methods max 4: ${getMax(4, 3 , "4th get max")}")
}

    private fun getMax(a: Int, b: Int) = if (a > b) a else b

    private fun getMax(a: Double, b: Double) = if (a > b) a else b

    private fun getMax(a: Double, b: Int) = if (a > b) a else b

    private fun getMax(a: Int, b: Int, c:String) = if (a > b) a else c


}