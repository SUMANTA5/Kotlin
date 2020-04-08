fun main() {
    val test = Test()
   test.addTwoNumber(5,2,object :Mysurvis{
       override fun sum(sum: Int) {
           println(sum)
       }
   })
    test.addTwoNumbers(5,2) { x , y -> x + y}
}

class Test {
    fun addTwoNumbers(a:Int,b: Int,action:(Int,Int)-> Int){
        val result = action(a,b)
        println(result)

    }



    fun addTwoNumber(a: Int, b: Int, action: Mysurvis) {

        val sum = a + b
        println(sum)
    }
}
interface Mysurvis{
    fun sum(sum : Int)
}