package com.company.Questions;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,6},
                {12,8,34,0},
                {23,45,56,67,89}
        };

        int ans[] = search2D(arr, 45);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2D(int[][] arr, int target){
       if (arr.length == 0){
           return new int[]{-1, -1};
       }
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr.length; col++){
                if (target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
