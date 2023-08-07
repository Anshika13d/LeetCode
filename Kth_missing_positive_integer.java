package leetCode;

import java.util.Arrays;

public class Kth_missing_positive_integer {
	static int findKthPositive(int[] arr, int k) {
        int i = 0;
		
		while(i < arr.length) {
			int shouldbe = arr[i] - 1;
			if(arr[i] != arr[shouldbe]) {
				swap(arr, i, shouldbe);
			}
			else {
				i++;
			}
		}
        for(int index=0;index<arr.length+k;index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length;
	}
     static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
     public static void main(String[] args) {
    		int[] arr = {2,3,4,7,11};
    		int k = 5;
    		
    		System.out.println(findKthPositive(arr,k));
    	}
}
