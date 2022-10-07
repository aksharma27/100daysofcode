package com.company.Questions;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 3,4));
        //18 is out of this range, so -1 is output
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end ; i++) {
            //check for element at every index
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
