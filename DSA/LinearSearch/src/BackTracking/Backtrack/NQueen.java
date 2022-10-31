package BackTracking.Backtrack;
//pepcoding

import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }


    //levels are passed in parameters, Options are passed in loops.
    public static void printNQueens(int[][] chess, String queensofar, int row){      //here row is level(passed as parameter)

        if (row == chess.length){       //when row == chess.length -> end
            System.out.println(queensofar + " .");
            return;
        }

        for(int col = 0; col < chess.length; col++){                        //col is option(passed as loops
            if (isQueenSafe(chess, row, col)){
                chess[row][col] = 1;
                printNQueens(chess, queensofar + row + "-" + col + ", ", row + 1 );
//            backtrack now
                chess[row][col] = 0;
            }
        }

    }

    static boolean isQueenSafe(int[][] chess, int row, int col){
        for (int i = row - 1, j = col; i >= 0; i--){
            if (chess[i][j] == 1){
                return false;
            }
        }

        //check for left diagonal
        for(int i = row - 1, j = col - 1; 1 >= 0 && j >= 0; i --, j--){
            if (chess[i][j] == 1)
                return false;
        }

        //check for right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j >= 0; i--, j++){
            if (chess[i][j] == 1){
                return false;
            }
        }

        //if all conditions are not matching => safe
        return true;
    }
}

