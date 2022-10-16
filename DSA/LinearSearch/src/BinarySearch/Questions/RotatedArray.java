package BinarySearch.Questions;

public class RotatedArray {
    static int findPivot(int[] arr){        //to find pivot only
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            //4 cases here:
            if (mid < end && arr[mid] > arr[mid + 1]){      //mid should always be less than end so that it does not goes outofbound
                return mid;
            }
            //case:2
            else if(mid > start && arr[mid] < arr[mid - 1]){        //mid should always be greater than start here
                return mid-1;
            }
            //case:3
            if (arr[mid] <= arr[start]){
                end = mid - 1;                          //ignore all the elements from middle
            }
            else {
                //start < mid -> more bigger elements lie beyond mid element
                start = mid + 1;
            }
        }
        //element not found
        return -1;
    }

    static int searchPivotBS(int[] nums, int target){
        int pivot = findPivot(nums);

        //if pivot not found == array is not rotated;
        if (pivot == -1){
            //do normal bs
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot found, you have found 2 asc sorted array
        if (nums[pivot] == target){

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length -1;

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

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        //if you don't find a pivot, that means the array is not rotated
        if (pivot == -1){
            //do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
//        if (nums(pivot) == target){
            return pivot;
        }
//        if ()
//    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        System.out.println(findPivot(arr));
    }
}
