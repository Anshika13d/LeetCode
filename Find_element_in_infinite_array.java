package leetCode;

public class Find_element_in_infinite_array {
	static int ans(int[] arr, int target) {
		//first we need to specify the search box initial indices:
		int start = 0;
		int end = 1;
		
		//condition for the target to lie in that range
		while(target > arr[end]) {
			int newStart = end + 1;
			
			//then double the size of search box
			int newend = end + (end - start + 1) *2;
			
			// Handle the case when target exceeds the length of the array
//            if (newend >= arr.length) {
//                end = arr.length - 1;
//                break;
//            }
            
			start = newStart;
			end = newend;
		}
		return binarySearch(arr,target,start,end);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		while(start<=end) {
			
			int middle = start + (end - start)/2;
			
			if(target < arr[middle]) {
				end = middle - 1;
			}
			else if(target > arr[middle]) {
				start = middle +1;
			}
			else {
				return middle; 
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
	int target = 10;
	System.out.println(ans(arr,target));
}
}
