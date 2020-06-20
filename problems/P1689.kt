import java.util.*
import kotlin.collections.HashSet

data class Point(var open: Int, var close: Int)

fun main() {
    val map: TreeMap<Int, Point> = TreeMap()
    val set: MutableSet<Int> = HashSet()
    System.`in`.bufferedReader().lineSequence().drop(1).forEach {
        val (left, right) = it.split(" ").map { num -> num.toInt() }
        map[left] = (map[left] ?: Point(0, 0)).also { p -> p.open++ }
        map[right] = (map[right] ?: Point(0, 0)).also { p -> p.close++ }
    }
    println(map.values.joinToString("") { ")".repeat(it.close) + "(".repeat(it.open) })
    var num = 0
    for (it in map.values.joinToString("") { ")".repeat(it.close) + "(".repeat(it.open) }) {
        set.add(if (it == '(') ++num else --num)
    }
    println(set.max())
}