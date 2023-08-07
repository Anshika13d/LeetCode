package leetCode;

import java.util.Arrays;

public class Q2784 {
	public static boolean isGood(int[] nums) {
		Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i] != i + 1){
                return false;
            }
        }
        return nums[n-1] == n-1;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(isGood(nums));
	}
}
