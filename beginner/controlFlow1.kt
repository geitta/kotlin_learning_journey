import kotlin.random.Random
fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

   if (firstResult == secondResult) {
       println("you win")
   } else {
        println("you lose")
    }
}