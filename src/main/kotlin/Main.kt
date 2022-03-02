import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main() {
    val timedValue = measureTimedValue {
        val userInput = "5"
            .plus(System.lineSeparator()).plus("8 3 7 9 2")
            .plus(System.lineSeparator()).plus("3")
            .plus(System.lineSeparator()).plus("5 7 9")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        `부품 찾기`().binarySearchMethod()
    }

    println()
    println("this operation took ${timedValue.duration}")
}