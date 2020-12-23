
public class Cell {
	int x;
	int y;
	boolean isAlive;
	
	public Cell(int x, int y, boolean isAlive) {
		this.x=x;
		this.y=y;
		this.isAlive=isAlive;
		
	}
	public String toString() {
		if(this.isAlive) {
			return "The cell at" +" "+ this.x+","+this.y+" " +"is Alive.";
			
		}else {
			return "The cell at" +" "+ this.x+","+this.y+" " +"is Dead.";
		}
	}

}
