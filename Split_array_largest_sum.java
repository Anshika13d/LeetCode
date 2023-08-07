package leetCode;

public class Split_array_largest_sum {
	public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i=0;i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        
        //binary search
        while(start < end){
            int mid = start + (end - start) /2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    //can not be added in subarray
                    //so we add this num in new subarray then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
