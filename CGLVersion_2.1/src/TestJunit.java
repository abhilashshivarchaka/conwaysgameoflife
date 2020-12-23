
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
 
public class TestJunit{
	@Test
	public void testCellone() {
		Cell c1 = new Cell(3,6,true);
		System.out.println("===TEST ONE EXECUTED=====");
		System.out.println(c1.toString());
		Assertions.assertEquals("The cell at 3,6 is Alive.", c1.toString());
	}
	@Test
	public void testCelltwo() {
		Cell c2 = new Cell(5,8,false);
		System.out.println("===TEST TWO EXECUTED=====");
		System.out.println(c2.toString());
		Assertions.assertEquals("The cell at 5,8 is Dead.", c2.toString());
	}
	@Test
	public void testBoardone() {
		Board b = new Board(2,2);
		int c[][]= {{1,0},{0,1}};
		b.createBoard(c);
		System.out.println("===TEST BOARD EXECUTED=====");
		System.out.println(b.toString());
		Assertions.assertEquals(".*\n*.\n", b.toString());
	}
	
}
