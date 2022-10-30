package BackTracking.Backtrack;

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
            System.out.println(queensofar);
            return;
        }

        for(int col = 0; col < chess.length; col++){                        //col is option(passed as loops
            chess[row][col] = 1;
            printNQueens(chess, queensofar + row + "-" + col + ", ", row + 1 );
//            backtrack now
            chess[row][col] = 0;
        }

    }
}

