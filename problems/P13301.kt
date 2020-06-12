val cache13301: MutableMap<Long, Long> = HashMap()

fun main() {
    val input = readLine()!!.toLong()
    val num = fibonacci(input)
    val prevNum = fibonacci(input - 1)
    println((num * 2 + prevNum) * 2)
}

fun fibonacci(num: Long): Long {
    if (num <= 1L) return num
    if (cache13301[num] == null) {
        cache13301[num] = fibonacci(num - 1) + fibonacci(num - 2)
    }
    return cache13301[num] ?: 0L
}