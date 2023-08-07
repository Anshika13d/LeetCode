package leetCode;

public class Search_in_rotated_sorted_array {
	static int search(int[] nums, int target) {
		int pivot = rotatedSearch(nums);
		
		//if you did not find a pivot, it means the array is not rotated
		if(pivot == -1) {
			//do normal binary search
			return binarySearch(nums, target,0, nums.length-1);
		}
		
		//if pivot is found you have  found 2 ascending sorted array
		if(nums[pivot] == target) {
			return pivot;
		}
		if(target >= nums[0]) {
			return binarySearch(nums, target, 0, pivot - 1);
		}
		
		return binarySearch(nums, target, pivot+1, nums.length-1);
	}
	
static int binarySearch(int[] nums,int target, int start, int end) {
		
		while(start<=end) {
			int middle = start + (end-start)/2;
			
			if(target<nums[middle]) {
				end = middle-1;
			}
			else if(target>nums[middle]) {
				start = middle+1;
			}
			else {
				return middle;
			}
		}
		return -1;
	}
	
//this will not work for duplicate value
	
	static int rotatedSearch(int[] nums) {
		int start = 0;
		int end = nums.length - 1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			//4 cases
			if(nums[mid] > nums[mid + 1]) {
				return mid;
			}
			if(nums[mid] < nums[mid - 1]) {
				return mid;
			}
			if(nums[start] >= nums[mid]) {
				end = mid + 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
}
