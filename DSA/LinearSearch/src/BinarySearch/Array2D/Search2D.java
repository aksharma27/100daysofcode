package BinarySearch.Array2D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Search2D {

    static boolean searchIn2D(int[][] matrix, int target){
        int len = matrix.length;
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < len && col >= 0){
            if(target == matrix[row][col])
                return true;
            if(matrix[row][col] > target){
                col--;
            }
            else if(matrix[row][col] < target){
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,49}
        };
        int target = 29;
        System.out.println(searchIn2D(arr, 39));

}}
