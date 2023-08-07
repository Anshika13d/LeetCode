package leetCode;

public class Q2460 {
	static int[] applyOperations(int[] nums) {
        int[] a = new int[nums.length];
        int n = a.length;
        int zero = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                a[i] = a[i] * 2;
                a[i+1] = 0;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<a.length;j++){
            if(a[j] != 0){
                a[zero] = a[j];
                zero++;
            }
        }
        for(int k=zero;k<n;k++){
            a[k] = 0;
        }
        return a;
    }
public static void main(String[] args) {
	int[] nums = {1,2,2,1,1,0};
	System.out.println(applyOperations(nums));
}
}
