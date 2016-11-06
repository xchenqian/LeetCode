public class _198_house_robber{
    public int rob(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int[] res = new int[nums.length + 1];
        res[0] = 0;
        res[1] = nums[0];
        for(int i=2; i<=nums.length; i++){
            res[i] = Math.max(res[i-1], res[i-2]+nums[i-1]);
        }
        return res[nums.length];
    }

    public int rob2(int[] nums){
        if(nums==null || nums.length==0){
            return 0;
        }
        if (nums.length==1) {
            return nums[0];
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        res[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<nums.length; i++){
            res[i] = Math.max(res[i-1], res[i-2]+nums[i]);
        }
        return res[nums.length-1];
    }

    public static void main(String[] args){
        _198_house_robber a = new _198_house_robber();
        int nums[] = {1, 1, 1};
        System.out.println(a.rob2(nums));
    }

}
