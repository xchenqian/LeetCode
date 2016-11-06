public class _122_best_time_to_buy_and_sell_stock_II{
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0; i<prices.length-1; i++){
            int diff = prices[i+1] - prices[i];
            if(diff > 0){
                profit += diff;
            }
        }
        return profit;
    }

    public static void main(String[] args){
        _122_best_time_to_buy_and_sell_stock_II a = new _122_best_time_to_buy_and_sell_stock_II();
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println("res: "+a.maxProfit(nums));
    }
}
