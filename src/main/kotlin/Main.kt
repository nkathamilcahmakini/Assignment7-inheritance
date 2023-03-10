fun main(){
   var car = Car("coupe","Audi A5","blue",4)
    car.carry(3)
    car.carry(6)
    car.identity()
    println(car.calculateParkingFees(4))

    var bus=Bus("Toyota","Minibus","Yellow",26)
    println(bus.maxTripFare(50.0))
    println(bus.calculateParkingFees(2))
}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity

open class Car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var carry = people - capacity
        if (people<=capacity){
            println("Carrying $people passengers")
        }
        else
        {
            println("over capacity $carry people")
        }
    }
    //identity() : Prints out the color, make and model in the following
   //format e.g: “I am a white subaru legacy”

    fun identity(){
        println("I am $color $make $model")
    }
    //calculateParkingFees(hours: Int) : Calculates and returns the
   //parking fees by multiplying the hours by 20

    open fun calculateParkingFees(hour:Int):Int{
        var total=hour*20
        return total
    }
}
// Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus

class Bus( make:String, model: String, color: String, capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        var total=fare * capacity
        return total

    }
    override fun calculateParkingFees(hour:Int):Int {
        var total = hour * capacity
        return total
    }

}