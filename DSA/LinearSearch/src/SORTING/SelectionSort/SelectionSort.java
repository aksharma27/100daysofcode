package SORTING.SelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find max element in the remaining array and swap with correct index
            int last = arr.length - i - 1;      //last will change in each traversal
            int max = getMaxIndex(arr, 0 , last);

            swap(arr, max, last);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for (int i = 0; i < last ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,7,1};
        selection(arr);
    }
}
