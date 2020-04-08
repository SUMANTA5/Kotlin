fun main() {
    val superCar = SuperCar()
    superCar.navigation()
    superCar.acceleration()
    superCar.breaks()


    var car = Car()
    car.breaks()
    car.acceleration()

}

class SuperCar:Car(){

    fun navigation (){
        println("Navigation")
    }

    override fun breaks() {
        println("Smartbreak")
    }
}
open class Car {
    fun acceleration (){
        println("Acceleration")
    }
    open fun breaks (){
        println("break")
    }
}