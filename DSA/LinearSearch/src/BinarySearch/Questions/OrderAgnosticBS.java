package BinarySearch.Questions;

public class OrderAgnosticBS {
    //find whether the array is ascending or in descending order
    //ascending: every element is greater than the first element, don't check two consicutive elements, check first and last elements, because;
    // arr = {3,3,3,2,1} -> fi we compare first and 2nd element, both are same but first and last will tell that it is descending order
    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 2};
        int ans = orderAgnosticBS(arr, 5);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
       // /find whether the array is in ascending or descending order
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }

            if (isAsc){
                if (target < arr[mid])
                    end = mid - 1;

                else if(target > arr[mid])
                    start = mid + 1;
            }


            else
            {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else if (target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
