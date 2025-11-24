data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
data class Name(val fname: String, val lname: String)
data class Address(val street: String, val city: City)
data class City(val name: String, val country: String)

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
}