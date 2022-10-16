package BinarySearch.Array2D;

public class StrictlySortedMatrix {

    //search in the row provided between the columns provided
    static int[] BS(int[][] arr, int target, int row, int colStart, int colEnd){
        while (colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
           if (target == arr[row][mid]){
               return new int[]{row, mid};
           }
           if (target > arr[row][mid]){
               colStart = mid + 1;
           }
           else {
               colEnd = mid - 1;
           }
        }
        return new int[] {-1,-1};
    }
        static int[] search(int[][] matrix, int target){
            int rows = matrix.length;
            int cols = matrix[0].length;        //be cautious -> matrix may be empty
            if (rows == 1){
                //apply simple bs for  1d array
                return BS(matrix, target, 0, 0, cols-1);
            }
            int rStart = 0;
            int rEnd = rows - 1;
            int cMid = cols / 2;
            //run the loop till 2 rows are remaining
            while (rStart < (rEnd - 1)) {        //while this is true, we'll have more than 2 rows
                int mid = rStart + (rEnd - rStart) / 2;
                if (matrix[mid][cMid] == target){
                    return new int[](mid, cMid);
                }
                if (matrix[mid][cMid] > target){
                    //row end will be miiddle in this case
                    rEnd = mid;
                }
                else {
                    rStart = mid;
                }
            }

//            now we have 2 rows
//            check whether the middle element of the column contains the ans or not
            if (matrix[rStart][cMid] == target){
                return new int[]{rStart, cMid};
            }

            //if the above condition is violated: start = start + 1
            if (matrix[rStart + 1][cMid] == target){
                return new int[]{rStart, cMid};
            }

//            search in 1st half
//            search in 2nd half
//            search in 3rd half
//            search in 4th half
        }
}
