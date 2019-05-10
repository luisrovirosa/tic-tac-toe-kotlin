class TicTacToe {
    var board = arrayOf(
        arrayOf("","",""),
        arrayOf("","",""),
        arrayOf("","","")
    )

    fun winner(): String {
        if ("X" == board[0][0] && "X" == board[0][1] && "X" == board[0][2]) {
            return "X"
        } else {
            return ""
        }
    }

    fun play(x: Int, y: Int) {
        board[x][y] = "X"
    }

}
