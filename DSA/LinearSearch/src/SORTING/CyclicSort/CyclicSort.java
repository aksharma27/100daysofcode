package SORTING.CyclicSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort {
    static void sort(int [] arr){
        for (int i = 0; i < arr.length; i++){
            int corret = arr[i] - 1;
            if (arr[i] != arr[corret]){
                swap(arr, i, corret);
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,2,5,4,1};
        sort(arr);
    }
}
