package BinarySearch.Questions;

public class FloorNumber {
    //Q) Given an array and target, find the number greater of equal to the target
    static int floor(int[] arr, int target){
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
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10};
        int ans = floor(arr, 8);
        System.out.println(ans);
    }
}
