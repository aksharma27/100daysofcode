package SORTING.MergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,6,-1,29,43,11};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, arr.length));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

   static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;      //left pointer
        int j = 0;      //right pointer
        int k = 0;      //merged arr pointer
        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //may be possible that one of the array is not complete, add the remaining elements to the merged array
        while (i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
