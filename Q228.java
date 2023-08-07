package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Q228 {
	public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> num = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int start = nums[i];
                while(i+1<nums.length && nums[i]+1==nums[i+1]){
                    i++;
                }
                if(start != nums[i]){
                    num.add(""+start+"->"+nums[i]);
                }
                else{
                    num.add(""+start);
                }
            }
        
        return num;
    }
public static void main(String[] args) {
	int[] arr = {0,1,2,4,5,7};
	System.out.println(summaryRanges(arr));
}
}
