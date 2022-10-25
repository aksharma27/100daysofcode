package SORTING.CyclicSort.Question;

public class FindMissingPositive {
    int findMin(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
//            ignore the negatives; if nums[i] > 0
//            and all the number less than or equal to length of the array is taken=> nums[i] <= nums.length
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
        
        //search for missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1){
                return j + 1;
            }
        }

        //case 2: if all elements are present then return the element just greater than array. eg: 1,2,3,4, then return 5
        return nums.length + 1;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
