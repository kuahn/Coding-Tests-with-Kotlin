import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class `왕실의 나이트 테스트` {
    @Test
    fun `method - d4, 8 성공`() {
        val userInput = "d4"

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `왕실의 나이트`().method()

        kotlin.test.assertEquals(expected = 8, actual = baos.toString().toInt())
    }
}