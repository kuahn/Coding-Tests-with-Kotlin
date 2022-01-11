import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main(args: Array<String>) {
    val timedValue = measureTimedValue {
        val userInput = "5"
            .plus(System.lineSeparator())
            .plus("R R R R D D L L")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        상하좌우().method()
    }

    println()
    println("this operation took ${timedValue.duration}")
}