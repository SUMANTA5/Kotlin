fun main(){
   val maxNumber = maxthree(5,3,10)
    println(maxNumber)
}
fun maxthree(a:Int,b:Int,c:Int):Int{
    if (a>b)
        if (a>c)
            return a
        else
            return c
    if (b>c)
        return b
    else
        return c
}