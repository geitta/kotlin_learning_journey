fun descirbeString(maybeString: String?): String {
    if (maybeString != null && maybeString.isNotEmpty()) {
        return "string of length ${maybeString.length}"
    } else {
        return "empty or null string"
    }
}

fun lengthString(maybe: String?): Int? = maybe?.length

fun main() {
   val nullString: String? = null
   println(descirbeString(nullString))
    println(lengthString(null))
}