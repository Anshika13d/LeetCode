package leetCode;

import java.util.Arrays;

public class Contains_duplicate2 {
public  static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==nums[i] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
public static void main(String[] args) {
	int[] arr = {1,2,3,1,2,3};
	System.out.println(containsNearbyDuplicate(arr,2));
}
}
