package BinarySearch.Questions;

public class SearchMountain
{
   static int search(int[] arr, int target){
       int peak = findPeak(arr);
       int firstTry = orderAgnosticBS(arr, target, 0 , peak);
       if (firstTry != -1){
           return firstTry;
       }
       return orderAgnosticBS(arr, target, peak, arr.length - 1);
   }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]){
                end = mid;      //it may be the answer, but look left
            }
            else {
                start = mid + 1; //mid + 1 element is greater than mid element
            }
        }
        //in the end, start == end and pointing to the largest number because of the 2 above checks
        //start and end are finding the max element in above 2 checks
        return start;       //or return end, because both are equal
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;
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
