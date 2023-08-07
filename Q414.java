package leetCode;

import java.util.Arrays;

public class Q414 {
	 public static int thirdMax(int[] nums) {
		 Arrays.sort(nums);
		 int j = 1;
	        for(int i=1;i<nums.length;i++){
	                if(nums[i] != nums[i-1]){
	                    nums[j] = nums[i];
	                    j++;
	                }
	            }
	        
	        if (j < 3) {
	            int max = nums[0];
	            for (int i = 0; i < j; i++) {
	                max = Math.max(max, nums[i]);
	            }
	            return max;
	        }
	        
	        return nums[j - 3];
	    }
	 public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(thirdMax(nums));
	}
}

