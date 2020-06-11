fun main() {
    val map: MutableMap<Int, MutableSet<Int>> = HashMap()
    var tmp = readLine()!!.split(" ")
    val n = tmp[0].toInt()
    val m = tmp[1].toInt()
    var result = 0
    repeat(m) {
        tmp = readLine()!!.split(" ")
        val a = tmp[0].toInt()
        val b = tmp[1].toInt()
        val set = map[a] ?: HashSet()
        set.add(b)
        map[a] = set
    }
    for (i in 1..n) {
        for (j in i + 1..n) {
            for (k in j + 1..n) {
                if (map[i]?.contains(j) == true || map[i]?.contains(k) == true ||
                        map[j]?.contains(i) == true || map[j]?.contains(k) == true ||
                        map[k]?.contains(i) == true || map[k]?.contains(j) == true) continue
                result++
            }
        }
    }
    println(result)
}