import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals


internal class `피보나치 테스트` {

    @Test
    fun `method1 - 10 성공`() {
        val userInput = "10"
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        피보나치().method1()

        assertEquals(expected = 55, actual = baos.toString().toInt())
    }

    @Test
    fun `method2 - 10 성공`() {
        val userInput = "10"
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        피보나치().method2()

        assertEquals(expected = 55, actual = baos.toString().toInt())
    }
}