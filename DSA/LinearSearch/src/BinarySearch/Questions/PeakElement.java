package BinarySearch.Questions;

public class PeakElement {
    //given a Bitonic Array/Mountain array, find the peak index(does not contain duplicate elements)

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
}