package TernarySearch;

public class TernarySearch {
    static int ternarySearch(int[] arr, int start, int end, int key){
        if (end >= 1){
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            if (arr[mid1] == key)
                return mid1;
            if (arr[mid2] == key)
                return mid2;
            if (key < arr[mid1]){
                return ternarySearch(arr, start, mid1 - 1, key);
            }
            else if (key > arr[mid2]){
                return ternarySearch(arr, mid2 + 1, end, key);
            }
            else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12,23,34,45,67};
        int ans = ternarySearch(arr, 0, arr.length, 34);
        System.out.println(ans);
    }
}
