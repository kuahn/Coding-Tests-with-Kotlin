import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals
import kotlin.time.ExperimentalTime


internal class `큰 수의 법칙 테스트` {

    @OptIn(ExperimentalTime::class)
    @Test
    fun `method1 - 5 8 3, 2 4 5 4 6 성공`() {
        val userInput = "5 8 3"
            .plus(System.lineSeparator())
            .plus("2 4 5 4 6")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `큰 수의 법칙`().method()

        assertEquals(expected = 46, actual = baos.toString().toInt())
    }

    @Test
    fun `method2 - 5 8 3, 2 4 5 4 6 성공`() {
        val userInput = "5 8 3"
            .plus(System.lineSeparator())
            .plus("2 4 5 4 6")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `큰 수의 법칙`().method2()

        assertEquals(expected = 46, actual = baos.toString().toInt())
    }
}