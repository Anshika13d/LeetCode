package leetCode;

import java.util.Arrays;

public class Merge_array {
static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=1;i<=m;i++) {
        	
        	nums1[i] = nums1[i];
        	nums2[nums1.length+1] = nums2[i];
        }
        System.out.println(Arrays.toString(nums2));
    }
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int m = 3;
		int[] arr2 = {2,5,6};
		int n = 3;
		merge(arr1,m,arr2,n);
	}
}
