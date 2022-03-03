import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main() {
    val timedValue = measureTimedValue {
        val userInput = "10"
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        피보나치().method1()
    }

    println()
    println("this operation took ${timedValue.duration}")
}