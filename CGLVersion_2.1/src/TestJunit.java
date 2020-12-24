
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
//	@Test
//	public void testBoardone() {
//		Board b = new Board(2,2);
//		int c[][]= {{1,0},{0,1}};
//		b.createBoard(c);
//		System.out.println("===TEST BOARD EXECUTED=====");
////		System.out.println(b.toString());
//		Assertions.assertEquals(".*\n*.\n", b.toString());
//	}
	@Test
	public void testPlaygame() {
		Board b =new Board (10, 10);
		
		int c[][] = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		b.createBoard(c);
		Playgame g=new Playgame();
		int c1[][] = b.current();
		String a = "";
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c1[0].length;j++) {
				a+=c1[i][j];
			}
			a+="\n";
		}
//		System.out.println(a);
		int c2[][] = g.nextgen(c1);
		String a1 = "";
		for(int i=0;i<c2.length;i++) {
			for(int j=0;j<c2[0].length;j++) {
				a1+=c2[i][j];
			}
			a1+="\n";
		}
//		System.out.println(a1);
		int c3[][] = {{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,1,1,0,0,0,0,0},
					{0,0,0,1,1,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,1,1,1,0,0,0,0,0},
					{0,0,1,1,0,0,0,0,0,0},
					{0,0,0,1,1,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0,0}};
		
		String a2 = "";
		for(int i=0;i<c3.length;i++) {
			for(int j=0;j<c3[0].length;j++) {
				a2+=c3[i][j];
			}
			a2+="\n";
		}
		Assertions.assertEquals(a2,a1);
	}
	
	
	
	
}
