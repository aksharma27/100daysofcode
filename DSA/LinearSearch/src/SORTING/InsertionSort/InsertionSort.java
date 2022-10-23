package SORTING.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else
                    break;      //if element j is not smaller than element j - 1
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {31,41,59,26,41,58};
        insertionSort(arr);
    }
}
