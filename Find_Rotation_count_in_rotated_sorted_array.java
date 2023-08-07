package leetCode;

public class Find_Rotation_count_in_rotated_sorted_array {
	static int countRotations(int[] arr) {
		int pivot = rotatedSearch(arr);
		return pivot + 1;
		
	}
	 //for non duplicates
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
//for dupllicates
	static int findPivotwithDuplicates(int[] nums) {
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
	
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		System.out.println(countRotations(arr));
	}
}
