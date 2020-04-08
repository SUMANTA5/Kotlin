fun dayOfWeek(a:Int):String{
    return when(a){
         1 -> "Sun"
         2 -> "Mon"
         3 -> "Tue"
         4 -> "Wed"
         5 -> "Thu"
         6 -> "Fri"
         7 -> "Sat"
        else -> "Not Day Of Week"
    }
}
fun main(){
    val day = dayOfWeek(1)
    println(day)
}