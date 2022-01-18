import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main(args: Array<String>) {
    val timedValue = measureTimedValue {
        val userInput = "d4"

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        `왕실의 나이트`().method()
    }

    println()
    println("this operation took ${timedValue.duration}")
}