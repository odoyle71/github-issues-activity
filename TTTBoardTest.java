import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TTTBoardTest {

	private TTTBoardSoln b;
	
	@Before
	public void setup() {
		b = new TTTBoardSoln();
	}
	
	@Test
	public void testRow0xWins() {
		assertEquals("x has not won.", '\0', b.row0winner());
		b.placeMark(0, 0, 'x');
		assertEquals("x has not won.", '\0', b.row0winner());
		b.placeMark(0, 1, 'x');
		assertEquals("x has not won.", '\0', b.row0winner());
		b.placeMark(0, 2, 'x');
		assertEquals("x has won.", 'x', b.row0winner());
	}
	
	@Test
	public void testRow0oWins() {
		assertEquals("o has not won.", '\0', b.row0winner());
		b.placeMark(0, 0, 'o');
		assertEquals("o has not won.", '\0', b.row0winner());
		b.placeMark(0, 1, 'o');
		assertEquals("o has not won.", '\0', b.row0winner());
		b.placeMark(0, 2, 'o');
		assertEquals("o has won.", 'o', b.row0winner());
	}
	
	@Test
	public void testRow1xWins() {
		assertEquals("x has not won.", '\0', b.row1winner());
		b.placeMark(1, 0, 'x');
		assertEquals("x has not won.", '\0', b.row1winner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won.", '\0', b.row1winner());
		b.placeMark(1, 2, 'x');
		assertEquals("x has won.", 'x', b.row1winner());
	}
	
	@Test
	public void testRow1oWins() {
		assertEquals("o has not won.", '\0', b.row1winner());
		b.placeMark(1, 0, 'o');
		assertEquals("o has not won.", '\0', b.row1winner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won.", '\0', b.row1winner());
		b.placeMark(1, 2, 'o');
		assertEquals("o has won.", 'o', b.row1winner());
	}
	
	@Test
	public void testRow2xWins() {
		assertEquals("x has not won.", '\0', b.row2winner());
		b.placeMark(2, 0, 'x');
		assertEquals("x has not won.", '\0', b.row2winner());
		b.placeMark(2, 1, 'x');
		assertEquals("x has not won.", '\0', b.row2winner());
		b.placeMark(2, 2, 'x');
		assertEquals("x has won.", 'x', b.row2winner());
	}
	
	@Test
	public void testRow2oWins() {
		assertEquals("o has not won.", '\0', b.row2winner());
		b.placeMark(2, 0, 'o');
		assertEquals("o has not won.", '\0', b.row2winner());
		b.placeMark(2, 1, 'o');
		assertEquals("o has not won.", '\0', b.row2winner());
		b.placeMark(2, 2, 'o');
		assertEquals("o has won.", 'o', b.row2winner());
	}
	
	@Test
	public void testCol0xWins() {
		assertEquals("x has not won.", '\0', b.col0winner());
		b.placeMark(0, 0, 'x');
		assertEquals("x has not won.", '\0', b.col0winner());
		b.placeMark(1, 0, 'x');
		assertEquals("x has not won.", '\0', b.col0winner());
		b.placeMark(2, 0, 'x');
		assertEquals("x has won.", 'x', b.col0winner());
	}
	
	@Test
	public void testCol0oWins() {
		assertEquals("o has not won.", '\0', b.col0winner());
		b.placeMark(0, 0, 'o');
		assertEquals("o has not won.", '\0', b.col0winner());
		b.placeMark(1, 0, 'o');
		assertEquals("o has not won.", '\0', b.col0winner());
		b.placeMark(2, 0, 'o');
		assertEquals("o has won.", 'o', b.col0winner());
	}
	
	@Test
	public void testCol1xWins() {
		assertEquals("x has not won.", '\0', b.col1winner());
		b.placeMark(0, 1, 'x');
		assertEquals("x has not won.", '\0', b.col1winner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won.", '\0', b.col1winner());
		b.placeMark(2, 1, 'x');
		assertEquals("x has won.", 'x', b.col1winner());
	}
	
	@Test
	public void testCol1oWins() {
		assertEquals("o has not won.", '\0', b.col1winner());
		b.placeMark(0, 1, 'o');
		assertEquals("o has not won.", '\0', b.col1winner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won.", '\0', b.col1winner());
		b.placeMark(2, 1, 'o');
		assertEquals("o has won.", 'o', b.col1winner());
	}
	
	@Test
	public void testCol2xWins() {
		assertEquals("x has not won.", '\0', b.col2winner());
		b.placeMark(0, 2, 'x');
		assertEquals("x has not won.", '\0', b.col2winner());
		b.placeMark(1, 2, 'x');
		assertEquals("x has not won.", '\0', b.col2winner());
		b.placeMark(2, 2, 'x');
		assertEquals("x has won.", 'x', b.col2winner());
	}
	
	@Test
	public void testCol2oWins() {
		assertEquals("o has not won.", '\0', b.col2winner());
		b.placeMark(0, 2, 'o');
		assertEquals("o has not won.", '\0', b.col2winner());
		b.placeMark(1, 2, 'o');
		assertEquals("o has not won.", '\0', b.col2winner());
		b.placeMark(2, 2, 'o');
		assertEquals("o has won.", 'o', b.col2winner());
	}
	
	@Test
	public void testDiagLeftToRightXWins() {
		assertEquals("x has not won.", '\0', b.diagLeftToRightWinner());
		b.placeMark(0, 0, 'x');
		assertEquals("x has not won.", '\0', b.diagLeftToRightWinner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won.", '\0', b.diagLeftToRightWinner());
		b.placeMark(2, 2, 'x');
		assertEquals("x has won.", 'x', b.diagLeftToRightWinner());
	}
	
	@Test
	public void testDiagLeftToRightOWins() {
		assertEquals("o has not won.", '\0', b.diagLeftToRightWinner());
		b.placeMark(0, 0, 'o');
		assertEquals("o has not won.", '\0', b.diagLeftToRightWinner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won.", '\0', b.diagLeftToRightWinner());
		b.placeMark(2, 2, 'o');
		assertEquals("o has won.", 'o', b.diagLeftToRightWinner());
	}
	
	@Test
	public void testDiagRightToLeftXWins() {
		assertEquals("x has not won.", '\0', b.diagRightToLeftWinner());
		b.placeMark(0, 2, 'x');
		assertEquals("x has not won.", '\0', b.diagRightToLeftWinner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won.", '\0', b.diagRightToLeftWinner());
		b.placeMark(2, 0, 'x');
		assertEquals("x has won.", 'x', b.diagRightToLeftWinner());
	}
	
	@Test
	public void testDiagRightToLeftOWins() {
		assertEquals("o has not won.", '\0', b.diagRightToLeftWinner());
		b.placeMark(0, 2, 'o');
		assertEquals("o has not won.", '\0', b.diagRightToLeftWinner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won.", '\0', b.diagRightToLeftWinner());
		b.placeMark(2, 0, 'o');
		assertEquals("o has won.", 'o', b.diagRightToLeftWinner());
	}
	
	@Test
	public void testRowWinnerX() {
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(0, 0, 'x');
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(0, 1, 'x');
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(0, 2, 'x');
		assertEquals("x has won.", 'x', b.rowWinner());
		
		b = new TTTBoardSoln();
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(1, 0, 'x');
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(1, 2, 'x');
		assertEquals("x has won.", 'x', b.rowWinner());
		
		b = new TTTBoardSoln();
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(2, 0, 'x');
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(2, 1, 'x');
		assertEquals("x has not won", '\0', b.rowWinner());
		b.placeMark(2, 2, 'x');
		assertEquals("x has won.", 'x', b.rowWinner());
	}
	
	@Test
	public void testRowWinnerO() {
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(0, 0, 'o');
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(0, 1, 'o');
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(0, 2, 'o');
		assertEquals("o has won.", 'o', b.rowWinner());
		
		b = new TTTBoardSoln();
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(1, 0, 'o');
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(1, 2, 'o');
		assertEquals("o has won.", 'o', b.rowWinner());
		
		b = new TTTBoardSoln();
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(2, 0, 'o');
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(2, 1, 'o');
		assertEquals("o has not won", '\0', b.rowWinner());
		b.placeMark(2, 2, 'o');
		assertEquals("o has won.", 'o', b.rowWinner());
	}

	@Test
	public void testColWinnerX() {
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(0, 0, 'x');
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(1, 0, 'x');
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(2, 0, 'x');
		assertEquals("x has won.", 'x', b.colWinner());
		
		b = new TTTBoardSoln();
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(0, 1, 'x');
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(2, 1, 'x');
		assertEquals("x has won.", 'x', b.colWinner());
		
		b = new TTTBoardSoln();
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(0, 2, 'x');
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(1, 2, 'x');
		assertEquals("x has not won", '\0', b.colWinner());
		b.placeMark(2, 2, 'x');
		assertEquals("x has won.", 'x', b.colWinner());
	}
	
	@Test
	public void testColWinnerO() {
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(0, 0, 'o');
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(1, 0, 'o');
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(2, 0, 'o');
		assertEquals("o has won.", 'o', b.colWinner());
		
		b = new TTTBoardSoln();
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(0, 1, 'o');
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(2, 1, 'o');
		assertEquals("o has won.", 'o', b.colWinner());
		
		b = new TTTBoardSoln();
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(0, 2, 'o');
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(1, 2, 'o');
		assertEquals("o has not won", '\0', b.colWinner());
		b.placeMark(2, 2, 'o');
		assertEquals("o has won.", 'o', b.colWinner());
	}
	
	@Test
	public void testDiagWinnerX() {
		assertEquals("x has not won", '\0', b.diagLeftToRightWinner());
		b.placeMark(0, 0, 'x');
		assertEquals("x has not won", '\0', b.diagLeftToRightWinner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won", '\0', b.diagLeftToRightWinner());
		b.placeMark(2, 2, 'x');
		assertEquals("x has won.", 'x', b.diagLeftToRightWinner());
		
		b = new TTTBoardSoln();
		assertEquals("x has not won", '\0', b.diagRightToLeftWinner());
		b.placeMark(0, 2, 'x');
		assertEquals("x has not won", '\0', b.diagRightToLeftWinner());
		b.placeMark(1, 1, 'x');
		assertEquals("x has not won", '\0', b.diagRightToLeftWinner());
		b.placeMark(2, 0, 'x');
		assertEquals("x has won.", 'x', b.diagRightToLeftWinner());
	}
	
	@Test
	public void testDiagWinnerY() {
		assertEquals("o has not won", '\0', b.diagLeftToRightWinner());
		b.placeMark(0, 0, 'o');
		assertEquals("o has not won", '\0', b.diagLeftToRightWinner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won", '\0', b.diagLeftToRightWinner());
		b.placeMark(2, 2, 'o');
		assertEquals("o has won.", 'o', b.diagLeftToRightWinner());
		
		b = new TTTBoardSoln();
		assertEquals("o has not won", '\0', b.diagRightToLeftWinner());
		b.placeMark(0, 2, 'o');
		assertEquals("o has not won", '\0', b.diagRightToLeftWinner());
		b.placeMark(1, 1, 'o');
		assertEquals("o has not won", '\0', b.diagRightToLeftWinner());
		b.placeMark(2, 0, 'o');
		assertEquals("o has won.", 'o', b.diagRightToLeftWinner());
	}
}
