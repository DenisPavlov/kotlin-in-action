package ch06.ex1_11_1_2_PlatformTypes1

import ch06.Person

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}

fun main() {
    val person = Person(null)
    val name: String = person.name
    yellAtSafe(Person(null))
}
