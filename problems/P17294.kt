fun main() {
    val input = readLine()!!.map { it.toString().toInt() }
    val bw = System.out.bufferedWriter(Charsets.UTF_8)
    if (input.size == 1) {
        bw.write("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
        bw.flush()
        bw.close()
        return
    }
    val dist = input[0] - input[1]
    for (i in 1 until input.size - 1) {
        if (dist == input[i] - input[i + 1]) continue
        bw.write("흥칫뿡!! <(￣ ﹌ ￣)>")
        bw.flush()
        bw.close()
        return
    }
    bw.write("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
    bw.flush()
    bw.close()
}