import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main() {
    val timedValue = measureTimedValue {
        val userInput = "10 19"
            .plus(System.lineSeparator()).plus("1 3 5 7 9 11 13 15 17 19")

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        `반복문으로 구현한 이진 탐색`().method()
    }

    println()
    println("this operation took ${timedValue.duration}")
}