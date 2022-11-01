package BackTracking.Backtrack;

public class NKnights {
    static void knight(boolean[][] board, int row, int col, int knights){
        if (knights==0){
            display(board);
            System.out.println();
        }

//        if col gets out of bound
        if (row == board.length - 1 && col == board.length){
            return;
        }


        //if reach the end, go for next line
        if (col == board.length){
            knight(board, row + 1, 0, knights);
            return;
        }
        if (isSafe(board, row, col)){
            board[row][col] = true;
            knight(board, row, col + 1, knights - 1);
            //now backtrack
            board[row][col] = false;
        }

        //if not safe -> above condition is false, move ahead and knights will be same
        knight(board, row, col + 1, knights);
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        //check the 4 conditions of board and knights
        if (isValid(board, row - 2, col - 1)){      //check valid condition
            if (board[row][col]){           //check if knight is present over there or not
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)){      //check valid condition
            if (board[row][col]){           //check if knight is present over there or not
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)){      //check valid condition
            if (board[row][col]){           //check if knight is present over there or not
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)){      //check valid condition
            if (board[row][col]){           //check if knight is present over there or not
                return false;
            }
        }
        return true;
    }

    //do not repeat  yourself hence created this function
    static boolean isValid(boolean[][] board, int row, int col){
        if (row >= 0 && row < board.length && col >= 0  && col < board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }
}
