fun main() {
    System.`in`.bufferedReader().readLines().drop(1).joinToString("\n") {
        var num = it
        var count = 0
        while (num != "6174") {
            num = kaprekar(num)
            count++
        }
        count.toString()
    }.let(::println)
}

fun kaprekar(num: String): String {
    val max = num.toCharArray().sortedDescending().joinToString("").toInt()
    val min = num.toCharArray().sorted().joinToString("").toInt()
    val result = (max - min).toString()
    return result.padStart(4, '0')
}