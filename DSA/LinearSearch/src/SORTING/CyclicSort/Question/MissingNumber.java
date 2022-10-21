package SORTING.CyclicSort.Question;

//Amazon

public class MissingNumber {
    static int findMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];           //since starting from 0 so no -1
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        //case 1: find missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != i){
                return i;
            }
        }

        //case 2: return n
        return arr.length;

    }

    static void swap(int[] arr, int first, int second){
        int temp = first;
        arr[first] = second;
        arr[second] = temp;
    }
}
