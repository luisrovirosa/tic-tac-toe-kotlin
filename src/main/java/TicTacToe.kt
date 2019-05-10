class TicTacToe {
    var board = arrayOf(
        arrayOf("","",""),
        arrayOf("","",""),
        arrayOf("","","")
    )

    fun winner(): String {
        if ("X" == board[0][0] && "X" == board[0][1] && "X" == board[0][2]) {
            return "X"
        }
        if ("X" == board[1][0] && "X" == board[1][1] && "X" == board[1][2]) {
            return "X"
        }
        if ("X" == board[2][0] && "X" == board[2][1] && "X" == board[2][2]) {
            return "X"
        }

        return ""
    }

    fun play(x: Int, y: Int) {
        board[x][y] = "X"
    }

}
