fun maxTowNumber(a:Int,b:Int):String{
    return when{
    a>b -> "max $a"
        else -> "max $b"
    }
}
fun main(){
    val r = maxTowNumber(5,2)
    println(r)
}