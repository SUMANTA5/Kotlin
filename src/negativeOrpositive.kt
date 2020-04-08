fun main(){
    val b = negative(0)
    println(b)

}
fun negative(a:Int):String{
    if (a>0)
        return "Positive"
    else
        if (a<0)
            return "Negative"
        else if (a==0)
            return "Zero"
        else
            return "NOT Number"
}