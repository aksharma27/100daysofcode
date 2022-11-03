package BackTracking.Backtrack;

public class SudokuSolver {
    static boolean isSafe(int[][] board, int row, int col, int num){
        //check row
        for (int i = 0; i < board.length; i++) {
            //check if the no. is in row or not.
            if (board[row][col] == num) {
                return false;
            }
        }

            //check if the no is in col or not
            for (int[] nums: board){
                if (nums[col] == num){
                    return false;
                }
            }

            int squrt = (int)(Math.sqrt(board.length));
            int rowStart = row - row % squrt;
            int colStart = col - col % squrt;

            for (int r = rowStart; r < rowStart + squrt; r++){
                for (int c = colStart; c < colStart + squrt; c++){
                    if (board[r][c] == num)
                        return false;
                }
            }
        return true;
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            //if found some element in row, break:
            if (!emptyLeft){
                break;
            }
        }

        if (emptyLeft){
            return true;
            //suduko is solved
        }


            //backtrack:
        for (int num = 1; num <= 9; num++){
            if (isSafe(board, row, col, num)){
                board[row][col] = num;
                if (solve(board)){
                    //found the answer
                    return true;
                }
                else {
                    board[row][col] = 0;        //backtrack
                }
            }
        }
        return false;
    }

    static void display(int[][] board){
        for (int[] row : board){
            for (int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{
                {}
        };
        if (solve(board)){
            display(board);
        }
        else
            System.out.println("Cannot solve");
    }

}
