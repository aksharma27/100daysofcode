package Non_LinearDS.Heaps;

import java.util.Arrays;

public class MaxHeapify {
    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if (left <= n && arr[left] > arr[largest]){
            largest = left;
        }
        if (right <= n && arr[right] > arr[largest]){
            largest = right;
        }
        if (largest != i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[second] = arr[second];
        arr[second] = temp;
    }

    static void buildHeap(int[] arr, int n){
        for (int i = n / 2; i > 0 ; i--) {
            heapify(arr, n, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {50,40,20,5,10,65,30,20};
        buildHeap(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
