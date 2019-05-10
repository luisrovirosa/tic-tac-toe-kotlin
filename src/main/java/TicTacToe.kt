class TicTacToe {
    var board = arrayOf(
        arrayOf("","",""),
        arrayOf("","",""),
        arrayOf("","","")
    )

    private var currentPlayer = "X"

    fun winner(): String {
        if (hasWonPlayerX("X")){
            return "X"
        }
        if (hasWonPlayerX("Y")){
            return "Y"
        }

        return ""
    }

    private fun hasWonPlayerX(player: String): Boolean {
        for (i in 0..2) {
            if (player == board[i][0] && player == board[i][1] && player == board[i][2]) {
                return true
            }
        }
        for (i in 0..2) {
            if (player == board[0][i] && player == board[1][i] && player == board[2][i]) {
                return true
            }
        }
        if (player == board[0][0] && player == board[1][1] && player == board[2][2]) {
            return true
        }
        if (player == board[2][0] && player == board[1][1] && player == board[0][2]) {
            return true
        }
        return false
    }

    fun play(x: Int, y: Int) {
        board[x][y] = currentPlayer
        currentPlayer = if (currentPlayer == "X") "Y" else "X"
    }

}
