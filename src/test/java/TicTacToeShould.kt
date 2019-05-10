import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals

class TicTacToeShould {
    @Test
    fun `at the beginning of the game there is no winner`() {
        val ticTacToe = TicTacToe()

        val winner = ticTacToe.winner()

        assertEquals("", winner)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2])
    fun `a X player wins when 3 fields of a row are taken by the same player`(row: Int) {
        val ticTacToe = TicTacToe()
        ticTacToe.play(row, 0)
        ticTacToe.play((row + 1) % 3, 0)
        ticTacToe.play(row, 1)
        ticTacToe.play((row + 2) % 3, 0)
        ticTacToe.play(row, 2)

        val winner = ticTacToe.winner()

        assertEquals("X", winner)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2])
    fun `a Y player wins when 3 fields of a row are taken by the same player`(row: Int) {
        val ticTacToe = TicTacToe()
        ticTacToe.play((row + 1) % 3, 0)
        ticTacToe.play(row, 0)
        ticTacToe.play((row + 1) % 3, 1)
        ticTacToe.play(row, 1)
        ticTacToe.play((row + 2) % 3, 0)
        ticTacToe.play(row, 2)

        val winner = ticTacToe.winner()

        assertEquals("Y", winner)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2])
    fun `a X player wins when 3 fields of a column are taken by the same player`(row: Int) {
        val ticTacToe = TicTacToe()
        ticTacToe.play(0, row)
        ticTacToe.play(0, (row + 1) % 3)
        ticTacToe.play(1, row)
        ticTacToe.play(0, (row + 2) % 3)
        ticTacToe.play(2, row)

        val winner = ticTacToe.winner()

        assertEquals("X", winner)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2])
    fun `a Y player wins when 3 fields of a column are taken by the same player`(row: Int) {
        val ticTacToe = TicTacToe()
        ticTacToe.play(0, (row + 1) % 3)
        ticTacToe.play(0, row)
        ticTacToe.play(1, (row + 1) % 3)
        ticTacToe.play(1, row)
        ticTacToe.play(0, (row + 2) % 3)
        ticTacToe.play(2, row)

        val winner = ticTacToe.winner()

        assertEquals("Y", winner)
    }

    @Test
    fun `a X player wins when left to right diagonal is taken by the X player`() {
        val ticTacToe = TicTacToe()
        ticTacToe.play(0, 0)
        ticTacToe.play(0, 1)
        ticTacToe.play(1, 1)
        ticTacToe.play(0, 2)
        ticTacToe.play(2, 2)

        val winner = ticTacToe.winner()

        assertEquals("X", winner)
    }

    @Test
    fun `a X player wins when right to left diagonal is taken by the X player`() {
        val ticTacToe = TicTacToe()
        ticTacToe.play(0, 2)
        ticTacToe.play(0, 0)
        ticTacToe.play(1, 1)
        ticTacToe.play(0, 1)
        ticTacToe.play(2, 0)

        val winner = ticTacToe.winner()

        assertEquals("X", winner)
    }

    @Test
    fun `a Y player wins when left to right diagonal is taken by the Y player`() {
        val ticTacToe = TicTacToe()
        ticTacToe.play(1, 0)
        ticTacToe.play(0, 0)
        ticTacToe.play(0, 1)
        ticTacToe.play(1, 1)
        ticTacToe.play(0, 2)
        ticTacToe.play(2, 2)

        val winner = ticTacToe.winner()

        assertEquals("Y", winner)
    }

}