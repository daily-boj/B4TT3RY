fun main() {
    val kr = listOf("ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ","ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ")
    val bw = System.out.bufferedWriter(Charsets.UTF_8)
    System.`in`.bufferedReader().readLine()!!.toCharArray()
            .joinToString("") {
                if ((it.toInt() - 0xAC00) / 588 >= 0)
                    kr[(it.toInt() - 0xAC00) / 588]
                else
                    it.toString()
            }.let(bw::write)
    bw.flush()
    bw.close()
}