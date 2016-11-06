public class _416_partition_equal_subset_sum{
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if(sum % 2 != 0){
            return false;
        }
        sum /= 2;
        int[][] dp = new int[nums.length][sum+1];
        for(int j=nums[0]; j<=sum; j++){
            dp[0][j] = nums[0];
        }
        for(int i=1; i<nums.length; i++){
            for(int j=nums[i]; j<=sum; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-nums[i]]+nums[i]);
            }
        }
        return dp[nums.length-1][sum]==sum;
    }

    public static void main(String[] args){
        _416_partition_equal_subset_sum a = new _416_partition_equal_subset_sum();
        int[] nums = {1, 1};
        System.out.println("res: " + a.canPartition(nums));
    }
}
