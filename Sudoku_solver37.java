package leetCode;

public class Sudoku_solver37 {
	
	static boolean solve(int[][] board) {
		int n = board.length;
		int row = -1;
		int column = -1;
		
		boolean emptyleft = true;
		//we are replacing r,c in argument
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j] == 0) {
				row = i;
				column = j;
				emptyleft = false;
				break;
				}
			}
			//if you found some empty element in row, then break
			if(emptyleft == false) {
				break;
			}
			
		}
		if(emptyleft == true) {
			return true;
			//sudoku is solved
		}
		
		
		//backtrack
		for(int number=1;number<=9;number++){
			if(isSafe(board,row,column,number)) {
				board[row][column] = number;
				if(solve(board)) {
					//found the answer
					return true;
				}
				else {
					//backtrack
					board[row][column] = 0;
				}
			}
		}
		return false;
	}
	
	
	private static void display(int[][] board) {
		for(int[] row: board) {
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}


	static boolean isSafe(int[][] board, int row, int column, int num) {
		//check the row
		if(board[row][column] ==  num) {
			return false;
		}

		//check the column
		for(int[] nums : board) {
			//check if the number is in the column
			
			if(nums[column] == num) {
				return false;
			}
		}
		int sqrt = (int)(Math.sqrt(board.length));
		int rowStart = row - row % sqrt;
		int colStart = column - column % sqrt;
		
		for(int r =rowStart;r<rowStart + sqrt;r++) {
			for(int c=colStart;c<colStart + sqrt;c++) {
				if(board[r][c] == num) {
					return false;
				}
			}
		}
		return true;
	}
	
public static void main(String[] args) {
	int[][] board = new int[][] {
		    {3, 0, 6, 5, 0, 8, 4, 0, 0},
			{5, 2, 0, 0, 0, 0, 0, 0, 0},
			{0, 8, 7, 0, 0, 0, 0, 3, 1},
			{0, 0, 3, 0, 1, 0, 0, 8, 0},
			{9, 0, 0, 8, 6, 3, 0, 0, 5},
			{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
			{1, 3, 0, 0, 0, 0, 2, 5, 0},
			{0, 0, 0, 0, 0, 0, 0, 7, 4},
			{0, 0, 5, 2, 0, 6, 3, 0, 0} 
	};
	if(solve(board)) {
		display(board);
	}
	else {
		System.out.println(solve(board));

	}
}
}
