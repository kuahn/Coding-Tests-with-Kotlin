import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main(args: Array<String>) {
    val timedValue = measureTimedValue {
        val userInput = "5 8 3"
            .plus(System.lineSeparator())
            .plus("2 4 5 4 6")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        `큰 수의 법칙`().method()
    }

    println()
    println("this operation took ${timedValue.duration}")
}