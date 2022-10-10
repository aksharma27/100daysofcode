package BinarySearch.Questions;
//Q) Given an array and target, find the number greater of equal to the target
public class CeilingNumber {

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr.length == 0)
                return  -1;

            if (target == arr[mid]){
                return mid;
            }

            if (target > arr[mid]){
                start = mid + 1;
            }
            if (target < arr[mid]){
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        int ans = ceiling(arr, 3);
        System.out.println(ans);
    }

}
