
class Board {
	int rows;
	int coloms;
	boolean[][] Cellgrid;
	
	public Board(int rows, int coloms) {
		this.rows=rows;
		this.coloms=coloms;
		this.Cellgrid=new boolean[rows][coloms];
	}
	public String toString() {
		String d = "";
		for(int i=0; i<this.rows;i++) {
			for(int j=0; j<this.coloms;j++) {
				if(Cellgrid[i][j]) {
					d+="*";	
				}
				else {
					d+=".";
				}
				
				
			}d+='\n';
			
		}return d;
	}
	public void createBoard(int c[][]) {
		for(int i=0;i<c.length;i++) {
			int rows=c[i][0];
			int coloms=c[i][1];
			this.Cellgrid[rows][coloms]=true;
		}
	}
		
	
	
}



