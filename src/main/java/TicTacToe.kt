class TicTacToe {
    var board = arrayOf(
        arrayOf("","",""),
        arrayOf("","",""),
        arrayOf("","","")
    )

    fun winner(): String {
        var i = 0
        if ("X" == board[i][0] && "X" == board[i][1] && "X" == board[i][2]) {
            return "X"
        }
        i++
        if ("X" == board[i][0] && "X" == board[i][1] && "X" == board[i][2]) {
            return "X"
        }
        i++
        if ("X" == board[i][0] && "X" == board[i][1] && "X" == board[i][2]) {
            return "X"
        }

        return ""
    }

    fun play(x: Int, y: Int) {
        board[x][y] = "X"
    }

}
