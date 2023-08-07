package leetCode;

public class Search_insert_position {
	 static int searchInsert(int[] arr, int target) {
	        int start = 0;
	        int end = arr.length;

	        while(start <= end){
	            int mid = start + (end - start) /2;
	            if(arr[mid] == target){
	                return mid;
	            }
	            else if(arr[mid] > target){
	                end = mid - 1;
	            }
	            else{
	                start = mid + 1;
	            }
	        }
	        for(int i=0;i<=arr.length;i++){
	            if(arr[i] != arr[i] - 1){
	                return arr[i]-1;
	            }
	        }
	        return start;
	    }
public static void main(String[] args) {
	int[] arr = {1,3,5,6};
	int target = 2;
	System.out.println(searchInsert(arr,target));
}
}
