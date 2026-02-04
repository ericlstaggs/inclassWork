/**
 * 
 */
package noon;

/**
 * 
 */
public class ticTacToe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = new char[3][3];
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; i < board.length; j++) {
				board[i][j] = 'X';
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; i < board.length; j++) {
				System.out.println(board[i][j]);
			}
			System.out.println("");
		}

	}

}
