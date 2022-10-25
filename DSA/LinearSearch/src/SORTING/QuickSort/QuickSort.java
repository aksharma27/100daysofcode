package SORTING.QuickSort;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end){

            //the reason, if it's already sorted, it will not swap
            while (arr[start] < pivot){     //every thing going good, do start ++
                start++;
            }

            while (arr[end] > pivot){
                end--;
            }

            //swap iff start <=end
            if (start <= end){
                int tmep = arr[start];
                arr[start] = arr[end];
                arr[end] = tmep;
                start++;
                end--;
            }
        }
        //Now, the pivot is at correct index, sort the two halves now-> (low, end) and (end, high)
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
