package leetCode;

import java.util.Arrays;

public class Find_first_and_last_position_of_sorted_array {
	static int[] searchRange(int[] nums, int target) {

		int[] ans = {-1,-1};
		
		//check for first occurrence  if target first
		int start = search(nums, target, true);
		int end = search(nums, target, false);
		
		ans[0] = start;
		ans[1] = end;
		
		return ans;
	}
	static int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		
		while(start<=end) {
			int middle = start + (end-start)/2;
			
			if(target<nums[middle]) {
				end = middle-1;
			}
			else if(target>nums[middle]) {
				start = middle+1;
			}
			else {
				ans = middle;
				if(findStartIndex) {
					end = middle - 1;
				}
				else {
					start = middle +1;
				}
			}
		}
		return ans;
	}

}
