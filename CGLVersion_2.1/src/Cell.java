
public class Cell {
	int rows;
	int colos;
	boolean isAlive;
	
	public Cell(int rows, int colos, boolean isAlive) {
		this.rows=rows;
		this.colos=colos;
		this.isAlive=isAlive;
		
	}
	public String toString() {
		if(this.isAlive) {
			return "The cell at" +" "+ this.rows+","+this.colos+" " +"is Alive.";
			
		}else {
			return "The cell at" +" "+ this.rows+","+this.colos+" " +"is Dead.";
		}
	}

}
