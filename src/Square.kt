fun higherOrder(number:Int,operation:(Int)->Int):Int{
    return square(number)
}

val square={value:Int->value*value}

fun main(args: Array<String>) {
    val number=(1..9).random()
    val result=higherOrder(number,square)
    println("The random number is $number and its square is $result")
}