//package BackTracking.Backtrack;
//
//import java.util.Scanner;
//
//public class NKnightsPEPCoding {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int row = in.nextInt();
//        int col = in.nextInt();
//
//        int[][] chessboard = new int[n][n];
//        displayKnightsTour(chessboard, row, col, 1);
//    }
//
//    public static void displayKnightsTour(int[][] chess, int row, int col, int moveNumber){
//        chess[row][col] = moveNumber;       //move chal diya row and col k liye
//        displayKnightsTour();
//    }
//
//    public static void displayBoard(){
//
//    }
//}
