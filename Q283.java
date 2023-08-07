package leetCode;

public class Q283 {
	static int[] moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length-1;i++){
            for(int j=arr.length;j>0;j--){
                if(nums[i] == 0){
                    arr[i] = nums[i];
                    
                }
            }
            
        }
        return new int[] {};
    }
public static void main(String[] args) {
	int[] nums = {0,1,0,3,12};
	moveZeroes(nums);
	
}
}
