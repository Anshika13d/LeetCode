package leetCode;

import java.util.Arrays;

public class Remove_element_27 {
	static int[] removeElement(int[] nums, int val) {
        if(nums == null || val < nums.length){
            return nums;
        }
        int[] expectedNums = new int[nums.length];
        for(int i=0,k=0;i<nums.length;i++) {
        	if(nums[i] == val) {
        		continue;
        	}
        	expectedNums[k++] = nums[i];
        }
        return expectedNums;
    }
public static void main(String[] args) {
	int[] arr = {3,2,2,3};
	int val = 3;
	System.out.println(Arrays.toString(removeElement(arr,val)));
}
}
