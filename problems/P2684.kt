fun main() {
    val repeat = readLine()!!.toInt()
    repeat(repeat) {
        val map = mutableMapOf("TTT" to 0, "TTH" to 0, "THT" to 0, "THH" to 0, "HTT" to 0, "HTH" to 0, "HHT" to 0, "HHH" to 0)
        val coin = readLine()!!
        for (i in 0..coin.length - 3) {
            val slice = coin.slice(i..i+2)
            map[slice] = map[slice]!! + 1
        }
        println(map.values.joinToString(" "))
    }
}