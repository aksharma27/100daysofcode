package com.company.Questions;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,23,45,0},
                {34,56,99,-1},
                {89,12,32,43,54,65}
        };
        int ans = maxIN2D(arr);
        System.out.println(ans);
    }

    static int maxIN2D(int[][] arr){
        int max = arr[0][0];
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
