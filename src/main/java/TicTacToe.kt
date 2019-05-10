class TicTacToe {
    var board = arrayOf(
        arrayOf("", "", ""),
        arrayOf("", "", ""),
        arrayOf("", "", "")
    )

    private var currentPlayer = "X"

    fun play(x: Int, y: Int) {
        board[x][y] = currentPlayer
        currentPlayer = if (currentPlayer == "X") "O" else "X"
    }

    fun winner(): String {
        if (hasWonPlayer("X")) {
            return "X"
        }
        if (hasWonPlayer("O")) {
            return "O"
        }

        return ""
    }

    private fun hasWonPlayer(player: String): Boolean {
        return hasFilledOneRow(player)
                || hasFilledOneColumn(player)
                || hasFilledOneDiagonal(player)
    }

    private fun hasFilledOneRow(player: String): Boolean {
        for (i in 0..2) {
            if (player == board[i][0] && player == board[i][1] && player == board[i][2]) {
                return true
            }
        }
        return false
    }

    private fun hasFilledOneColumn(player: String): Boolean {
        for (i in 0..2) {
            if (player == board[0][i] && player == board[1][i] && player == board[2][i]) {
                return true
            }
        }
        return false
    }

    private fun hasFilledOneDiagonal(player: String): Boolean {
        return ((player == board[0][0] && player == board[1][1] && player == board[2][2])
                || (player == board[0][2] && player == board[1][1] && player == board[2][0]))
    }

}
