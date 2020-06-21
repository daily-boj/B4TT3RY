fun main() {
    var k = 0
    var stones: List<Int> = listOf()
    var sum = 0
    var activated = 0
    System.`in`.bufferedReader().lineSequence().forEachIndexed { i, s ->
        when (i) {
            0 -> k = s.split(" ")[1].toInt()
            1 -> stones = s.split(" ").map { it.toInt() }.sorted()
        }
    }
    for (stone in stones) {
        sum += activated * stone
        if (activated < k) activated++
    }
    println(sum)
}