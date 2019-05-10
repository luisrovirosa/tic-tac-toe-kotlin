class TicTacToe {
    var board = arrayOf(
        arrayOf("","",""),
        arrayOf("","",""),
        arrayOf("","","")
    )

    fun winner(): String {
        return if ("X" == board[0][0] && "X" == board[0][1] && "X" == board[0][2]) "X" else ""
    }

    fun play(x: Int, y: Int) {
        board[x][y] = "X"
    }

}
