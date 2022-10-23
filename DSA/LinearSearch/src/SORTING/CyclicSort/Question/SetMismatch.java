package SORTING.CyclicSort.Question;

public class SetMismatch {
    public static int findMismatch(int[] arr){
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
                    return i + 1;
                }
            }
            else
                i++;
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,2,6,5};
        int ans = findMismatch(arr);
        System.out.println(ans);
    }
}
