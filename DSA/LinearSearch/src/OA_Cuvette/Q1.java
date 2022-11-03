package OA_Cuvette;

public class Q1 {
    static int findAvg(int[] arr){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }

    static int count(int[] arr, int avg){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (avg == arr[i])
                count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5};
        int avg = findAvg(arr);
        System.out.println(count(arr, avg));
    }
}
