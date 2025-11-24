fun main() {
    var pizzaSlices = 0
//    while (pizzaSlices++ < 7) {
//        println("there's only $pizzaSlices slices of pizza left")
//    }
//    println("There are ${pizzaSlices++} slices of pizza. Hooray! We have a whole pizza! :D")

    do {
        pizzaSlices++
        println("there's only $pizzaSlices slices of pizza left")
    } while (pizzaSlices < 7)
    pizzaSlices++
    println("There are ${pizzaSlices} slices of pizza. Hooray! We have a whole pizza! :D")

}