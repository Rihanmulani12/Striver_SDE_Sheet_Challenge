public class BestTimetoBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxprofitans(prices));

    }
    static int maxprofitans(int[] prices){
        int min = prices[0];
        int profit = 0;
        int cost = 0;

        for (int i = 1; i <prices.length ; i++) {
            cost = prices[i]-min;

            profit = Math.max(profit,cost);

            min = Math.min(min,prices[i]);

        }
         return profit;
    }
}
