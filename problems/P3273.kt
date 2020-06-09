fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toList()
    val x = readLine()!!.toInt()
    var result = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            if (a[i] + a[j] == x) result++
        }
    }
    println(result)
}