import kotlin.math.max

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val nmap: MutableList<Int> = MutableList(n) { 0 }
    val mmap: MutableList<Int> = MutableList(m) { 0 }
    for (i in 0 until n) {
        val input = readLine()!!
        input.toCharArray().forEachIndexed { index, value -> mmap[index] = mmap[index] + if (value == 'X') 1 else 0 }
        nmap[i] = input.filter { it == 'X' }.length
    }
    println(max(mmap.filter { it == 0 }.size, nmap.filter { it == 0 }.size))
}