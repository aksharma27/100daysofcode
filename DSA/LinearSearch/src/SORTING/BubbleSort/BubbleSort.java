package SORTING.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted
            if (!swapped){      // !false = true
                break;
            }
        }
        return arr;
    }
}
