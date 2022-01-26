import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

internal class `음료수 얼려 먹기 테스트` {

    @Test
    fun `method - 15 14, 결과 8 성공`() {
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
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `음료수 얼려 먹기`().method()

        assertEquals(expected = 8, actual = baos.toString().toInt())
    }

    @Test
    fun `method - 3 14, 결과 1 성공`() {
        val userInput = "3 14"
            .plus(System.lineSeparator()).plus("00000000000000")
            .plus(System.lineSeparator()).plus("11111000011111")
            .plus(System.lineSeparator()).plus("00000000000000")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `음료수 얼려 먹기`().method()

        assertEquals(expected = 1, actual = baos.toString().toInt())
    }

    @Test
    fun `method - 5 5, 결과 3 성공`() {
        val userInput = "5 5"
            .plus(System.lineSeparator()).plus("00011")
            .plus(System.lineSeparator()).plus("11100")
            .plus(System.lineSeparator()).plus("11111")
            .plus(System.lineSeparator()).plus("11100")
            .plus(System.lineSeparator()).plus("11100")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `음료수 얼려 먹기`().method()

        assertEquals(expected = 3, actual = baos.toString().toInt())
    }
}