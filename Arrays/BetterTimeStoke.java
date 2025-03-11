package Arrays;

public class BetterTimeStoke {
    public  static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if (buy<prices[i]) {
                profit=Math.max(profit,prices[i]-buy);
            }
            if (buy>prices[i]) {
                buy=prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
