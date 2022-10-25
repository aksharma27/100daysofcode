package SORTING.MergeSort;
//without creating a new array do merge sort
public class InPlaceMerge {
    static void mergeSortInPlace(int[] arr, int start, int end){
        if (end - start == 1){
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        //now change the original array
        mergeInPlace(arr, start, mid, end);
    }

    static int[] mergeInPlace(int[] arr, int start, int mid, int end){
            int[] mix = new int[end - start];
            int i = start;
            int j = mid;
            int k = 0;

            while (i < mid && j < end){         //i is going till mid -1 and so end is going till end - 1
if (arr[i] < arr[j]){
    mix[k] = arr[i];
    i++;
}
else {
    mix[k] = arr[j];
    j++;
}
            }
            return new int[] {-1,-1};
    }
}
