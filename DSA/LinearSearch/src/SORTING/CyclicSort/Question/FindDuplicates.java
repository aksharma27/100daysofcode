package SORTING.CyclicSort.Question;

public class FindDuplicates {
    public int findDuplicates(int[] arr){
        int i = 0;
        while(i < arr.length){

            //check duplicates
            if (arr[i] != i+1)
            {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
                else {
                    //found the answer
                    return arr[i];
                }
            }
            else
                i++;


        }
        return -1;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
