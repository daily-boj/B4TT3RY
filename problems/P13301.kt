val cache: MutableMap<Long, Long> = HashMap()

fun main() {
    val input = readLine()!!.toLong()
    val num = fibonacci(input)
    val prevNum = fibonacci(input - 1)
    println((num * 2 + prevNum) * 2)
}

fun fibonacci(num: Long): Long {
    if (num <= 1L) return num
    if (cache[num] == null) {
        cache[num] = fibonacci(num - 1) + fibonacci(num - 2)
    }
    return cache[num] ?: 0L
}