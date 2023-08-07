package leetCode;

public class Finf_in_mountain_array {
	
	int search(int[] arr, int target) {
		int peak = peakIndexInMountainArray(arr);
		int firstTry = orderAgnosticBS(arr,target,0, peak);
		if(firstTry != -1) {
			return firstTry;
		}
		//try to search in second half
		return orderAgnosticBS(arr, target, peak + 1, peak); 
	}
	
	static int peakIndexInMountainArray(int [] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int middle = start + (end - start)/2;
			
			if(arr[middle] > arr[middle + 1]) {
				// descending part
				end = middle;
			}
			else {
				//ascending part
				start = middle + 1;
			}
		}
		return start;
	}
	static int orderAgnosticBS(int[] arr, int target, int start, int end) {
		boolean isAscending = arr[start]<arr[end];
		
		while(start<=end){
				int middle = start + (end-start)/2;
				 
				//common condition 
				if(arr[middle]==target) {
					return middle;
			}
				if(isAscending) {
			     	if(target<arr[middle]) {
					end = middle-1;
				}
				
				else {
					start = middle+1;
				}
				}
				else {
					if(target>arr[middle]) {
						end = middle-1;
					}
					else {
						start = middle+1;
					}
				}
			}
		return -1;
	}

}
