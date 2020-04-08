import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a number : ")

    val number = scanner.nextInt()

    when {
        number % 2 == 0 -> println("$number is even")
        number % 2 != 0 -> println("$number is odd")
    }
}