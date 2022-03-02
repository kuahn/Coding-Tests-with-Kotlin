import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class `부품 찾기 테스트` {
    @Test
    fun `binarySearchMethod - 5, 8 3 7 9 2, 3, 5 7 9 성공`() {
        val userInput = "5"
            .plus(System.lineSeparator()).plus("8 3 7 9 2")
            .plus(System.lineSeparator()).plus("3")
            .plus(System.lineSeparator()).plus("5 7 9")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()

        System.setIn(bais)
        System.setOut(PrintStream(baos))

        `부품 찾기`().binarySearchMethod()

        assertEquals(expected = "NO YES YES ", actual = baos.toString())
    }

    @Test
    fun `binarySearchMethod - 6, 8 3 7 9 2, 3, 5 7 9 Exceeded number of parts 실패`() {
        val userInput = "6"
            .plus(System.lineSeparator()).plus("8 3 7 9 2")
            .plus(System.lineSeparator()).plus("3")
            .plus(System.lineSeparator()).plus("5 7 9")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()

        System.setIn(bais)
        System.setOut(PrintStream(baos))

        val exception = assertThrows<IllegalStateException> {
            `부품 찾기`().binarySearchMethod()
        }

        assertEquals("Exceeded number of parts", exception.message)
    }

    @Test
    fun `binarySearchMethod - 5, 8 3 7 9 2, 3, 5 7 9 10 Exceeded number of necessary parts 실패`() {
        val userInput = "5"
            .plus(System.lineSeparator()).plus("8 3 7 9 2")
            .plus(System.lineSeparator()).plus("3")
            .plus(System.lineSeparator()).plus("5 7 9 10")
            .plus(System.lineSeparator())

        val bais = ByteArrayInputStream(userInput.toByteArray())
        val baos = ByteArrayOutputStream()

        System.setIn(bais)
        System.setOut(PrintStream(baos))

        val exception = assertThrows<IllegalStateException> {
            `부품 찾기`().binarySearchMethod()
        }

        assertEquals("Exceeded number of necessary parts", exception.message)
    }
}