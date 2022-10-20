package SORTING.CyclicSort.Question;

public class MissingNumber {
    static int returnMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = first;
        arr[first] = second;
        arr[second] = temp;
    }
}
