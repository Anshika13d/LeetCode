package leetCode;

import java.util.Arrays;

public class Q2016 {
	public static int maxi(int[]nums) {
		Arrays.sort(nums);
        int sub = 0;
        int max = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
        	for(int j=0;j<n;j++) {
                if(i < j && nums[i] < nums[j]){
                sub = nums[j] - nums[i];
                sub = max;
            }
            if(max > sub){
                max = sub;
            }
            
            }
        }
        return sub;
	}
public static void main(String[] args) {
	int[] arr = {7,1,5,4};
	System.out.println(maxi(arr));
}
}
