import java.lang.Long.min

fun main() {
    var (x, y, w, s) = readLine()!!.split(" ").map { it.toLong() }
    if (x < y) x = y.also { y = x }
    val mod = (x + y) % 2 // x + y 짝수 확인
    val onlyW = (x + y) * w // 한 블록씩만 움직이는 방법
    val onlyS = ((x - mod) * s) + (mod * w) // 대각선으로만 움직이는 방법, 대각선으로만 움직이는게 불가능할 시 한 블록씩 움직일 수 있는 방법
    val ws = (y * s) + ((x - y) * w) // 대각선으로 갈 수 있는데까지 간 후, 한 블록씩 움직이는 방법
    println(min(onlyW, min(onlyS, ws)))
}

// x + y가 짝수일 경우에만 대각선으로만 움직일 수 있다고 한다.
// 만약 홀수일 경우 짝수만큼만 대각선으로 이동 후 나머지는 한 블록씩 이동한다.