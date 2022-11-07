package Non_LinearDS.Heaps;

import java.util.Arrays;

public class DeleteNodeInHeap {
    static void delete(int[] arr, int n){
        arr[1] = arr[n];
        n = n - 1;
        int i = 1;
        while (i < n){
            int left = arr[2 * i];
            int right = arr[2 * i + 1];
            int max = (left > right) ? 2*i : 2*i+1;
            if (arr[max] > arr[i]){
                swap(arr, i , max);
                i = max;
            }
            else return;
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {40,30,10,20,15};
        delete(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}
