class TicTacToe {
    var board = arrayOf(
        arrayOf("","",""),
        arrayOf("","",""),
        arrayOf("","","")
    )

    private var currentPlayer = "X"

    fun winner(): String {
        var xHasWon = hasWonPlayerX()
        if (xHasWon){
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

    private fun hasWonPlayerX(): Boolean {
        var xHasWon = false
        for (i in 0..2) {
            if ("X" == board[i][0] && "X" == board[i][1] && "X" == board[i][2]) {
                xHasWon = true
            }
            if ("X" == board[0][i] && "X" == board[1][i] && "X" == board[2][i]) {
                xHasWon = true
            }
        }
        if ("X" == board[0][0] && "X" == board[1][1] && "X" == board[2][2]) {
            xHasWon = true
        }
        if ("X" == board[2][0] && "X" == board[1][1] && "X" == board[0][2]) {
            xHasWon = true
        }
        return xHasWon
    }

    fun play(x: Int, y: Int) {
        board[x][y] = currentPlayer
        currentPlayer = if (currentPlayer == "X") "Y" else "X"
    }

}
