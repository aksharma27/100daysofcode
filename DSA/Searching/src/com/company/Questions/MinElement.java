package com.company.Questions;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {-7,3,4,12,19,-20};
        System.out.println(min(arr));
    }

    static int min(int arr[]){
        int min = arr[0];
        for (int i = 1;  i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
