
public class TicTacToe {
	public static void main(String[] args) {
		char[][] board = new char[3][3]; 
		
		board[0][0] = 'X';
		board[0][1] = 'X';
		board[0][2] = 'X';
		board[1][0] = 'X';
		board[1][1] = 'X';
		board[1][2] = 'X';
		board[2][0] = 'X';
		board[2][1] = 'X';
		board[2][2] = 'X';
		
		
		// display tic-tac-toe
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
