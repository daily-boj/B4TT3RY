val cache9461: MutableMap<Long, Long> = HashMap()

fun main() {
    (0 until readLine()!!.toInt()).joinToString("\n") {
        padovan(readLine()!!.toLong()).toString()
    }.let(::println)
}

fun padovan(num: Long): Long {
    if (num <= 3) return 1
    if (cache9461[num] == null) {
        cache9461[num] = padovan(num - 2) + padovan(num - 3)
    }
    return cache9461[num] ?: 0
}