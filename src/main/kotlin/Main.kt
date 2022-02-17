import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main(args: Array<String>) {
    val timedValue = measureTimedValue {
        val userInput = "3"
            .plus(System.lineSeparator()).plus("15")
            .plus(System.lineSeparator()).plus("27")
            .plus(System.lineSeparator()).plus("12")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        `위에서 아래로`().method()
    }

    println()
    println("this operation took ${timedValue.duration}")
}