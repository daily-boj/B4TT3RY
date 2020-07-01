fun main() {
    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
    val arr1: MutableList<List<Int>> = ArrayList()
    for (i in 0 until x1) {
        arr1.add(readLine()!!.split(" ").map { it.toInt() })
    }

    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
    val arr2: MutableList<List<Int>> = ArrayList()
    for (i in 0 until x2) {
        arr2.add(readLine()!!.split(" ").map { it.toInt() })
    }

    val arr: MutableList<MutableList<Int>> = ArrayList()
    for (i in 0 until x1) {
        val list: MutableList<Int> = ArrayList()
        for (j in 0 until y2) {
            var sum = 0
            for (a in 0 until y1) {
                sum += (arr1[i][a] * arr2[a][j])
            }
            list.add(sum)
        }
        arr.add(list)
    }
    
    arr.joinToString("\n") { it.joinToString(" ") }.let(::println)
}