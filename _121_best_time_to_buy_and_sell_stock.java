public class _121_best_time_to_buy_and_sell_stock{
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i : prices){
            if(i < min){
                min = i;
            }
            profit = Math.max(i - min, profit);
        }
        return profit;
    }

    public static void main(String[] args){
        _121_best_time_to_buy_and_sell_stock a = new _121_best_time_to_buy_and_sell_stock();
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println("res: "+a.maxProfit(nums));
    }
}
