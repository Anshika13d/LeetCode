package leetCode;

public class Sum_of_squares_ofSpecial_nos2778 {
	static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(n % (i+1) == 0 ){
                sum = nums[i] * nums[i] + sum;
            }
        }
        return sum;
    }
public static void main(String[] args) {
	int[] arr = {2,7,1,19,18,3};
	System.out.println(sumOfSquares(arr));
}
}
