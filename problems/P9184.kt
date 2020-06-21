val cache9184: MutableMap<String, Int> = HashMap()

fun main() {
    System.`in`.bufferedReader().readLines().dropLast(1).joinToString("\n") {
        val (a, b, c) = it.split(" ").map { num -> num.toInt() }
        "w($a, $b, $c) = ${w(a, b, c)}"
    }.let(::println)
}

fun w(a: Int, b: Int, c: Int): Int {
    if (cache9184["$a $b $c"] == null) {
        cache9184["$a $b $c"] = when {
            a <= 0 || b <= 0 || c <= 0 -> 1
            a > 20 || b > 20 || c > 20 -> w(20, 20, 20)
            b in (a + 1) until c -> w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
            else -> w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
        }
    }
    return cache9184["$a $b $c"]!!
}