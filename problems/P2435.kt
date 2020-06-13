fun main() {
    val tempSum: MutableSet<Int> = HashSet()
    val (n, k) = readLine()!!.trim().split(" ").map { it.toInt() }
    val temperature = readLine()!!.trim().split(" ").map { it.toInt() }
    for (i in 0..n - k) {
        temperature.slice(i until i + k).sum().let(tempSum::add)
    }
    tempSum.max().let(::println)
}