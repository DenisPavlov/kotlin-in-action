package ch06.ex3_5_2_Arrays1

fun main() {
    val letters = Array(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))
}
