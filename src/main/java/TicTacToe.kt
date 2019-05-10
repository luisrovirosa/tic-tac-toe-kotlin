class TicTacToe {
    var board = arrayOf(
        arrayOf("","",""),
        arrayOf("","",""),
        arrayOf("","","")
    )

    fun winner(): String {
        for (i in 0..2){
            if ("X" == board[i][0] && "X" == board[i][1] && "X" == board[i][2]) {
                return "X"
            }
        }

        return ""
    }

    fun play(x: Int, y: Int) {
        board[x][y] = "X"
    }

}
