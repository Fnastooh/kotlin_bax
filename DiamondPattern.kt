fun printDiamond(n: Int) {
    // نیمه بالایی (شامل ردیف وسط)
    for (i in 1..n) {
        val spaces = " ".repeat(n - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
    // نیمه پایینی
    for (i in n - 1 downTo 1) {
        val spaces = " ".repeat(n - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
}

fun main() {
    print("Enter diamond size: ")
    val n = readLine()?.toIntOrNull() ?: 5
    printDiamond(n)
}
