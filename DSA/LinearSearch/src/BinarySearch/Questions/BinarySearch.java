package BinarySearch.Questions;

public class BinarySearch
{
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
//            find middle element
//            int mid = (start + end) / 2;
//           but this (start + end) might exceed the integer max value if start and end are very large values, then we'll use:
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
                return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 0 , 34, 12, -29, 45, 90};
        int ans = binarySearch(arr, 90);
        System.out.println(ans);
    }
}
