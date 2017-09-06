/**
 * Simple representation of a Tic-Tac-Toe board. This class has a not
 * particularly clever implementation of winner checking. However, it is good
 * for illustrating the use of Git/GitHub.
 */
public class TTTBoardSoln {
	private char[][] board;

	/**
	 * Construct an empty TTT board.
	 */
	public TTTBoardSoln() {
		board = new char[3][3];
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				board[r][c] = '.';
			}
		}
	}

	/**
	 * Place the specified mark in the specified row and column.
	 * 
	 * @param row the row
	 * @param col the column
	 * @param mark the mark to place
	 */
	public void placeMark(int row, int col, char mark) {
		if (row < 0 || row > 2) {
			throw new IllegalArgumentException("Row must be in range 0-2.");
		}
		
		if (col < 0 || col > 2) {
			throw new IllegalArgumentException("Col must be in range 0-2.");
		}
		
		if (mark != 'x' && mark != 'o') {
			throw new IllegalArgumentException("Mark must be 'x' or 'o'.");
		}
			
		if (board[row][col] != '.') {
			throw new IllegalArgumentException("Location is not emtpy.");
		}
		
		board[row][col] = mark;
	}

	/**
	 * Check if there is a winner in row 0
	 * 
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char row0winner() {
		if (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x') {
			return 'x';
		} else if (board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o') {
			return 'o';
		} else {
			return '\0';
		}
	}

	/**
	 * Check if there is a winner in row 1
	 * 
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char row1winner() {
		return '\0';
	}

	/**
	 * Check if there is a winner in row 2
	 * 
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char row2winner() {
		return '\0';
	}

	/**
	 * Check if there is a winner in col 0
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char col0winner() {
		return '\0';
	}

	/**
	 * Check if there is a winner in col 1
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char col1winner() {
		return '\0';
	}

	/**
	 * Check if there is a winner in col 2
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char col2winner() {
		return '\0';
	}

	/**
	 * Check if there is a winner diagonally from top left to bottom right.
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char diagLeftToRightWinner() {
		return '\0';
	}

	/**
	 * Check if there is a winner diagonally from top right to bottom left.
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char diagRightToLeftWinner() {
		return '\0';
	}

	/**
	 * Check if there is a winner in any row.
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char rowWinner() {
		return '\0';
	}

	/**
	 * Check if there is a winner in any column.
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char colWinner() {
		return '\0';
	}

	/**
	 * Check if there is a winner diagonally.
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char diagWinner() {
		return (char) (diagLeftToRightWinner() | diagRightToLeftWinner());
	}
	
	/**
	 * Check if there is a winner on the board.
	 *
	 * @return 'x' if x wins, 'o' if o wins, and null (i.e. '\0') otherwise.
	 */
	public char winner() {
		return (char) (rowWinner() | colWinner() | diagWinner());
	}
}