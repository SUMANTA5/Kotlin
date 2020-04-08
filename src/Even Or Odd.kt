fun EvenOrOdd(a:Int):String{
    if (a%2==0)
        return "Even"
    else
        return "Odd"
}
fun main(){
    val number = EvenOrOdd(9)
    println(number)
}