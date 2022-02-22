import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class `반복문으로 구현한 이진 탐색 테스트` {

    @Test
    fun `method - 10 7, 4 성공`() {
        val userInput = "10 7"
            .plus(System.lineSeparator()).plus("1 3 5 7 9 11 13 15 17 19")

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `반복문으로 구현한 이진 탐색`().method()

        kotlin.test.assertEquals(expected = 4, actual = baos.toString().toInt())
    }

    @Test
    fun `method - 10 19, 10 성공`() {
        val userInput = "10 19"
            .plus(System.lineSeparator()).plus("1 3 5 7 9 11 13 15 17 19")

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()
        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `반복문으로 구현한 이진 탐색`().method()

        kotlin.test.assertEquals(expected = 10, actual = baos.toString().toInt())
    }
}