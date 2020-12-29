
//class Playgame{
//	public int[][] nextgen(int board[][]){
//		int rows = board.length;
//		int col = board[0].length;
//		int count=0;
//		int[][] next= new int [rows][col];
//		for(int i=1;i<rows;i++) {
//			for(int j=1;j<col;j++) {
//				if(i+1<rows) {
//					if(board[i+1][j] == 1) {
//						count += 1;
//					}
//				}
//				if(j+1<rows) {
//					if(board[i][j+1] == 1) {
//						count += 1;
//					}
//				}
//				if(i-1>=0) {
//					if(board[i-1][j] == 1) {
//						count += 1;
//					}
//				}
//				if(j-1>=0) {
//					if(board[i][j-1] == 1) {
//						count += 1;
//					}
//				}
//				if(i+1<rows && j-1>=0) {
//					if(board[i+1][j-1] == 1) {
//						count += 1;
//					}
//				}
//				if(i+1<rows && j+1<rows) {
//					if(board[i+1][j+1] == 1) {
//						count += 1;
//					}
//				}
//				if(i-1>=0 && j-1>=0) {
//					if(board[i-1][j-1] == 1) {
//						count += 1;
//					}
//				}
//				if(i-1>=0 && j+1<rows) {
//					if(board[i-1][j+1] == 1) {
//						count += 1;
//					}
//				}
//				if(board[i][j]==1) {
//					if(count==2 || count==3) {
//						next[i][j]=1;
//					}
//					else {
//						next[i][j]=0;
//					
//					}
//					count=0;
//					
//				}
//				else {
//					if(count==3) {
//						next[i][j]=1;
//					}
//					else {
//						next[i][j]=0;
//					}
//					count=0;
//				}
//				
//				
//				
//				
//			}
//		}
//		return next;
//		
//	}
//}