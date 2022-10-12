package BinarySearch.Questions;

public class CeilChar {
//    Given a character array, return the samllest character in the array that is larger than the target
static char smallChar(char[] arr, char target){
    int start = 0;
    int end = arr.length -1;
    while (start <= end)
    {
        int mid = start + (end - start) / 2;

       if (target > arr[mid]){
           start = mid + 1;
       }
       else {
           end = mid - 1;
       }
    }
    return arr[start % arr.length];
}

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'd', 'h', 'k'};
        System.out.println(smallChar(arr, 'j'));
    }
}

