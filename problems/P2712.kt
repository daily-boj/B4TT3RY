fun main() {
    System.`in`.bufferedReader().readLines().drop(1).joinToString("\n") {
        val (value, unit) = it.trim().split(" ")
        when (unit) {
            "kg" -> "${String.format("%.4f", value.toDouble() * 2.2046)} lb"
            "lb" -> "${String.format("%.4f", value.toDouble() * 0.4536)} kg"
            "l" -> "${String.format("%.4f", value.toDouble() * 0.2642)} g"
            "g" -> "${String.format("%.4f", value.toDouble() * 3.7854)} l"
            else -> ""
        }
    }.let(::println)
}