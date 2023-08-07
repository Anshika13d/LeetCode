package leetCode;

public class Remove_duplicates26 {
	static int removeDuplicates(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j<nums.length;j++) {
				if(nums[i] == nums[j]) {
					return nums[i];
				}
				return nums[j];
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}

}
