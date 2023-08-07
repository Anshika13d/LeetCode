 package leetCode;

public class RotatedArray_duplicate_values {
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
	
static int binarySearch(int[] arr,int target, int start, int end) {
		
		while(start<=end) {
			int middle = start + (end-start)/2;
			
			if(target<arr[middle]) {
				end = middle-1;
			}
			else if(target>arr[middle]) {
				start = middle+1;
			}
			else {
				return middle;
			}
		}
		return -1;
	}
static int rotatedSearch(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			//4 cases
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			if(arr[mid] == arr[start] && arr[mid -1] == arr[end]){
				//skip the duplicates
				//but what if the elements at start and end were the pivot?
				//check if start is pivot
				if(arr[start] > arr[start +1]) {
					return start;
				}
				start++;
				
				//check whether end is pivot
				if(arr[end] < arr[end-1]) {
					return end -1;
				}
				end--;
			}
			
			//left side is sorted, so pivot should be in right
			
			else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
