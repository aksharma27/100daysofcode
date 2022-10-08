package com.company;

import java.util.Arrays;

public class LinearSearch {


    public static void main(String[] args) {
        int[] arr = {1,3,4,9,5,23,56};
        int target = 23;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;      //if target not found
    }
}
