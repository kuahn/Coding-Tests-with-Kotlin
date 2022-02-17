import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

internal class `위에서 아래로 테스트` {
    @Test
    fun `method - 3, 15 27 12 성공`() {
        val userInput = "3"
            .plus(System.lineSeparator()).plus("15")
            .plus(System.lineSeparator()).plus("27")
            .plus(System.lineSeparator()).plus("12")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `위에서 아래로`().method()

        assertEquals(expected = "27 15 12", actual = baos.toString())
    }
}