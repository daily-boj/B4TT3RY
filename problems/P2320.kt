fun main() {
    val list: MutableList<String> = ArrayList()
    val set: MutableSet<String> = HashSet()
    (0 until readLine()!!.toInt()).forEach { _ -> list.add(readLine()!!) }
    for (i in 0 until list.size) {
        val now = list[i]
        list.filterIndexed { index, str -> index != i && now.first() == str.last() }.forEach {
            set.add(it + now)
        }
    }
    println(set.map { it.length }.max())
}