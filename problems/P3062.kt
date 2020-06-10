fun main() {
    val repeat = readLine()!!.toInt()
    repeat(repeat) {
        val num = readLine()!!.toInt()
        val sum = (num + num.toString().reversed().toInt()).toString()
        println(if (sum == sum.reversed()) "YES" else "NO")
    }
}