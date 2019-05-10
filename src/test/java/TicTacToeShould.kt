import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TicTacToeShould {
    @Test
    fun `at the beginning of the game there is no winner`(){
        val ticTacToe = TicTacToe()

        val winner = ticTacToe.winner()

        assertEquals("", winner)
    }
}