package BinarySearch.Questions;

public class PositionInfinite {
    //given a sorted array of infinite numbers, find position of an element in this array (Amazon Interview)

//    solution: since the array is infinite, we cannot use array.lenght function; assuming we don't know the size
//    take the array in chunks, rather than finding the start and end, i.e, increasing the size of our window exponentially
//

    public static void main(String[] args) {
    // start with box of size of 2
        int[] arr = {1,2,3,4,5,6,12,23,34,35,36,45,56,78,79,80,82,89};
        int ans = findRange(arr, 36);
        System.out.println(ans);
    }

    static int findRange(int[] arr, int target){
        //first start with a box of size = 2
        int start = 0;
        int end = 1;
        //condition for target to lie in the range
        //target should be less than end. target will lie greater than arr[end]
        while(target > arr[end])
        {
            int newStart = end + 1;
            //double the box size : end = end + sizeofBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return Infinite(arr, target, start, end);
    }

    static int Infinite(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                start = mid + 1;
            if (target < arr[mid])
                end = mid - 1;
            if (target == arr[mid])
                return mid;
        }
        return -1;
    }


}
