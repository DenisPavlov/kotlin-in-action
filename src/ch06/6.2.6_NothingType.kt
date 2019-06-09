package ch06.ex2_6_NothingType

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun foo(u: Unit) {
    println(u)
}

fun main() {
    foo(Unit)
    fail("Error occurred")
}
