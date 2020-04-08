import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    print("Enter a number : ")

    val number = scanner.nextInt()
    for (i in 1..number){
        println(i)
    }
}