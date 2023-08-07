package leetCode;

import java.util.Arrays;

public class Best_time_to_buy_and_sell_stock {
	static int profit(int[] prices) {
		int l = 1;
        int r = 0;
        int maxprofit = 0;
        while(r < l){
            if(prices[l] < prices[r] ){
               int profit = prices[r] - prices[l];
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                l=r;
                r += 1;
            }
        }
        return maxprofit;
	}
public static void main(String[] args) {
	int[] arr = {7,1,5,3,6,4};
	System.out.println(profit(arr));
}
}
