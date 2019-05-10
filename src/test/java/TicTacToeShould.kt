import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TicTacToeShould {
    @Test
    fun `at the beginning of the game there is no winner`(){
        val ticTacToe = TicTacToe()

        val winner = ticTacToe.winner()

        assertEquals("", winner)
    }

    @Test
    fun `a player wins when 3 fields of a row are taken by the same player`(){
        val ticTacToe = TicTacToe()
        ticTacToe.play(0,0)
        ticTacToe.play(1,0)
        ticTacToe.play(0,1)
        ticTacToe.play(2,0)
        ticTacToe.play(0,2)

        val winner = ticTacToe.winner()

        assertEquals("X", winner)
    }
}