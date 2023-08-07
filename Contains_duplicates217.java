package leetCode;

import java.util.Arrays;

public class Contains_duplicates217 {
public static boolean ans(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
public static void main(String[] args) {
	int[] arr = {2,4,5,6,2,4,5};
	System.out.println(ans(arr));
}
}
