fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var count = 1
    while (a < b) {
        b /= if (b % 10 == 1) 10 else if (b % 2 == 0) 2 else break
        count++
    }
    println(if (a == b) count else -1)
}