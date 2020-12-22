import java.util.Scanner;

class Conwaysgameoflife {
	public void createBoard (final int n, int[][] livecells) {
		boolean[][] board = new boolean[n][n];
		for(int i=0; i<livecells.length;i++) {
			for(int j=0 ; j<livecells.length;j++) {
				board[livecells[i][0]][livecells[i][1]] = true;
				
			}
			
		}
		printBoard(board);
		
	}

public void printBoard(boolean board[][]) {
    for(int i=0; i<board.length;i++){
        String s ="";
        for(int j=0; j<board[0].length; j++){
            if(board[i][j]==false){
                s +=". ";
            }else if(board[i][j] == true){
                s += "* ";
            } 
        }
        System.out.println(s.substring(0,s.length()-1));
    }
    
}
}
