import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    print("Enter the number:")
    val number = scanner.nextInt()
    for (i in  number downTo 1)
        println(i)
}