fun main() {
    val n = readLine()!!.toInt()
    var count: Long = 1
    var last: Long = 1
    for (i in 1..n) {
        count += last + 3
        last += 3
    }
    println(count % 45678)
}