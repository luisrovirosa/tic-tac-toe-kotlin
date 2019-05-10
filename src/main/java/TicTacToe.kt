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
        for (i in 0..2) {
            if ("Y" == board[i][0] && "Y" == board[i][1] && "Y" == board[i][2]) {
                return "Y"
            }
            if ("Y" == board[0][i] && "Y" == board[1][i] && "Y" == board[2][i]) {
                return "Y"
            }
        }
        if ("Y" == board[0][0] && "Y" == board[1][1] && "Y" == board[2][2]) {
            return "Y"
        }
        if ("Y" == board[2][0] && "Y" == board[1][1] && "Y" == board[0][2]) {
            return "Y"
        }

        return ""
    }

    private fun hasWonPlayerX(player: String): Boolean {
        for (i in 0..2) {
            if (player == board[i][0] && player == board[i][1] && player == board[i][2]) {
                return true
            }
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
