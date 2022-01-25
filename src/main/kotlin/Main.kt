import java.io.ByteArrayInputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTimedValue

@OptIn(ExperimentalTime::class)
fun main(args: Array<String>) {
    val timedValue = measureTimedValue {
        val userInput = "15 14"
            .plus(System.lineSeparator()).plus("00000111100000")
            .plus(System.lineSeparator()).plus("11111101111110")
            .plus(System.lineSeparator()).plus("11011101101110")
            .plus(System.lineSeparator()).plus("11011101100000")
            .plus(System.lineSeparator()).plus("11011111111111")
            .plus(System.lineSeparator()).plus("11011111111100")
            .plus(System.lineSeparator()).plus("11000000011111")
            .plus(System.lineSeparator()).plus("01111111111111")
            .plus(System.lineSeparator()).plus("00000000011111")
            .plus(System.lineSeparator()).plus("01111111111000")
            .plus(System.lineSeparator()).plus("00011111111000")
            .plus(System.lineSeparator()).plus("00000001111000")
            .plus(System.lineSeparator()).plus("11111111110011")
            .plus(System.lineSeparator()).plus("11100011111111")
            .plus(System.lineSeparator()).plus("11100011111111")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        System.setIn(bais)

        `음료수 얼려 먹기`().method()
    }

    println()
    println("this operation took ${timedValue.duration}")
}