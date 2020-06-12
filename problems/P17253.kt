fun main() {
    val input = readLine()!!.toLong(10).toString(3)
    println(if (input == "0" || "2" in input) "NO" else "YES")
}