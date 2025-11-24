fun main() {
    val numbers = listOf(1,-2,3,-4,5, -6)
    val positives = numbers.filter ({x -> x > 0})
    val negatives = numbers.filter ({x -> x < 0})
//    println(positives)
//    println(negatives)
    val doubles = numbers.map {x -> x * 2}
    val isTripled = {x: Int -> x * 3}
    val tripled = numbers.map(isTripled)
    println(doubles)
    println(tripled)
}