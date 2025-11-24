fun main() {
    val numbers = 1..100
    for (n in numbers) {
        if (n % 5  ==0 && n%3 == 0) {
            println("FizzBuzz")
        } else if (n % 3 == 0) {
            println("Fizz")
        } else if (n % 5 == 0) {
            println("Buzz")
        } else{
            println(n)
        }
    }
    
    // simpler solution
    for (number in 1..100) {
        println(
            when {
                number % 15 ==0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            }
        )
    }
}