import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val candy: MutableMap<Int, Double> = HashMap()
    val people: MutableMap<Int, Int> = HashMap()
    var count = 0
    BufferedReader(InputStreamReader(System.`in`))
            .lineSequence()
            .drop(2)
            .forEach {
                if (it.isEmpty()) {
                    count++
                } else {
                    candy[count] = (candy[count] ?: 0.0) + it.toDouble()
                    people[count] = (people[count] ?: 0) + 1
                }
            }
    for (i in 0 until candy.size) {
//        println("${candy[i]} % ${people[i]} = ${candy[i]!! % people[i]!!}")
        println(if ((candy[i]!! % people[i]!!).toInt() == 0) "YES" else "NO")
    }
}