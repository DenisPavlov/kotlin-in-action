package ch02.ex3_2_1_WhenEnums

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Каждый"
        Color.ORANGE -> "Охотник"
        Color.YELLOW -> "Желает"
        Color.GREEN -> "Знать"
        Color.BLUE -> "Где"
        Color.INDIGO -> "Сидить"
        Color.VIOLET -> "Фазан"
    }

fun main(args: Array<String>) {
    println(getMnemonic(Color.YELLOW))
}
