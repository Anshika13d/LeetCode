package leetCode;

public class Q122_buy_sell_stocks {
	static int maxProfit(int[] prices) {
        int left = Integer.MAX_VALUE;
        int right1 = 0;
        int right2 = 0;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < left){
                left = prices[i];
                
            }
            right1 = prices[i] - left;
            if(prices[i] < right1){
                left = prices[i];
                right2 = prices[i] - left;
            }
            if(maxProfit < right2){
                maxProfit = right2;
            }
            maxProfit = right1 + right2;
        }
        return maxProfit;
    }
public static void main(String[] args) {
	int[]prices = {7,1,5,3,6,4};
	System.out.println(maxProfit(prices));
}
}
