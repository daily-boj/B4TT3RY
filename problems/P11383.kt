fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val inputList: MutableList<String> = ArrayList()
    val doldomList: MutableList<String> = ArrayList()
    repeat(n) {
        inputList.add(readLine()!!.map { it.toString().repeat(2) }.joinToString(""))
    }
    repeat(n) {
        doldomList.add(readLine()!!)
    }
    println(if (inputList.filterIndexed { index, str -> doldomList[index] != str }.isEmpty()) "Eyfa" else "Not Eyfa")
}