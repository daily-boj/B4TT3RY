fun main() {
    var a = readLine()!!.toBigInteger()
    var n = 2
    while ({ a =  a.div(n.toBigInteger()); a }() != 1.toBigInteger()) {
        n++
    }
    println(n)
}