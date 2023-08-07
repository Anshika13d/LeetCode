package leetCode;

public class Q910 {
	public static int smallestRangeII(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] <= k){
                nums[i] = nums[i] + k;
            }
            else{
                nums[i] = nums[i] - k;
            }
        }
        return Math.max(nums[0],nums[nums.length]) - Math.min(nums[0],nums[nums.length]);
    }
public static void main(String[] args) {
	int[] arr = {1,3,6};
	System.out.println(smallestRangeII(arr,3));
}
}
