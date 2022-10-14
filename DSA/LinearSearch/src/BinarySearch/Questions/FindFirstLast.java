package BinarySearch.Questions;

public class FindFirstLast{
	static int[] searchRange(int[] nums, int target){
	int[] ans = {-1, -1};	//in case answer is not found
	
	//check for first occurrence if target first
	int start = search(nums, target, true);
	int end = search(nums, target, false);
	
	ans[0] = start;
	ans[1] = end;
	
	return ans;	
    }
  

//this func returns the index value of target
  static int search(int[] nums, int target, boolean findStartIndex){
	int ans = -1;
	int start = 0;
	int end = nums.length - 1;
	while(start <= end){
	int mid = start + (end - start) / 2;
	
	if (target < nums[mid]){
		end = mid - 1;
	}
	else if(target > nums[mid]){
		start = mid + 1;
	}
	else{
		//potential answer found
		ans = mid;
		if(findStartIndex) {
			end = mid - 1;
		}
		else{
			start = mid + 1;
		}
	}
    }
     return ans;
  }

	public static void main(String[] args){
		int nums[] = {1,2,3,4,4,4,5,6,7,8,9,9};
		int[] ans = searchRange(nums, 4);
		
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

}