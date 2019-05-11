package strings

fun String.lastChar(): Char = get(this.length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
}
