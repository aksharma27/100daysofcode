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
    static int orderAgnosticBS(int[] arr, int target){
        int start =  0;
        int end = arr.length - 1;
        int mid = start + (start + end) / 2;

        if (arr[start] > arr[end]){       //descending order
            if (target > arr[mid]){
                end = mid - 1;
            }
            else if (target < arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        else{
            if (target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else
                return -1;
        }

        return -1;
    }
}
