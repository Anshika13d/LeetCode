package leetCode;

public class Peak_index_in_a_mountain_array {
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
		//in the end start == end and pointing the largest number because of the 2 checks above
		//start and end always trying to find max element in the above 2 checks
		//hence, when they are pointing to just one element, that is the max one
		//at every point of the time for start and end, they have the best possible answer till that time
		return start;
	}

}
