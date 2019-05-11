package ch03.ex3_3_2_UtilityFunctionsAsExtensions1

import ch03.strings.joinToString

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))
}
