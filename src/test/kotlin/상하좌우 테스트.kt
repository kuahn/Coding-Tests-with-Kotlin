import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class `상하좌우 테스트` {

    @Test
    fun `method - 5, R R R R D D L L U, 2 3 성공`() {
        val userInput = "5"
            .plus(System.lineSeparator())
            .plus("R R R R D D L L U")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        상하좌우().method()

        kotlin.test.assertEquals(expected = "2 3", actual = baos.toString())
    }
}