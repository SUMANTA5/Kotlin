fun main(){
    val a = 5
    val b = 10
    val c = maxin(a, b)
    println(c)
}
fun maxin(a:Int,b:Int):Int{
    return if (a>b)
        a
    else
        b
}