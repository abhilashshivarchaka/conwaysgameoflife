
class Board {
	int rows;
	int coloms;
	boolean[][] Cellgrid;
	
	public Board(int rows, int coloms) {
		this.rows=rows;
		this.coloms=coloms;
		this.Cellgrid=new boolean[rows][coloms];
	}
	public int[][] current() {
		int[][] d = new int[this.rows][this.coloms] ;
		
		for(int i=0; i<this.rows;i++) {
			for(int j=0; j<this.coloms;j++) {
				if(Cellgrid[i][j]) {
					d[i][j]+=1;	
				}
				else {
					d[i][j]+=0;
				}
				
				
			}
			
		}return d;
	}
	public void createBoard(int c[][]) {
		for(int i=0;i<c.length;i++) {
			int rows=c[i][0];
			int coloms=c[i][1];
			this.Cellgrid[rows][coloms]=true;
		}
	}
	public boolean[][] nextgen(){
		int rows = this.rows;
		int col = this.coloms;
		int count=0;
		boolean[][] next= new boolean [rows][col];
		for(int i=0;i<rows;i++) {
//			count=0;
			for(int j=0;j<col;j++) {
				count=0;
				if(i+1<rows) {
					if(this.Cellgrid[i+1][j] == true) {
						count += 1;
					}
				}
				if(j+1<col) {
					if(this.Cellgrid[i][j+1] == true) {
						count += 1;
					}
				}
				if(i-1>=0) {
					if(this.Cellgrid[i-1][j] == true) {
						count += 1;
					}
				}
				if(j-1>=0) {
					if(this.Cellgrid[i][j-1] == true) {
						count += 1;
					}
				}
				if(i+1<rows && j-1>=0) {
					if(this.Cellgrid[i+1][j-1] == true) {
						count += 1;
					}
				}
				if(i+1<rows && j+1<col) {
					if(this.Cellgrid[i+1][j+1] == true) {
						count += 1;
					}
				}
				if(i-1>=0 && j-1>=0) {
					if(this.Cellgrid[i-1][j-1] == true) {
						count += 1;
					}
				}
				if(i-1>=0 && j+1<col) {
					if(this.Cellgrid[i-1][j+1] == true) {
						count += 1;
					}
				}
				
				
				if(this.Cellgrid[i][j]==true) {
					if(count==2 || count==3) {
						next[i][j]=true;
					}
//					else {
//						next[i][j]=false;
//					
//					}
//					count=0;
					
				}
				else {
					if(count==3) {
						next[i][j]=true;
					}
//					else {
//						next[i][j]=false;
//					}
//					count=0;
				}
						
			}
		}
		return next;
		
	}
	
	
		
	
	
}



