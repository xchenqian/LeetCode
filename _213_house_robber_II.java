public class _213_house_robber_II{
    public int rob(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }else if(nums.length==1){
            return nums[0];
        }else if (nums.length==2) {
            return Math.max(nums[0], nums[1]);
        }else{
            return Math.max(robHouse(nums, 0, nums.length-2), robHouse(nums, 1, nums.length-1));
        }
    }

    private int robHouse(int[] nums, int bg, int end){
        int len = end - bg + 1;
        if (len == 2) {
            return Math.max(nums[bg],nums[end]);
        }
        int[] res = new int[len];
        res[0] = nums[bg];
        res[1] = Math.max(nums[bg], nums[bg+1]);
        for(int i=2; i<len; i++){
            res[i] = Math.max(res[i-1], res[i-2]+nums[bg+i]);
        }
        return res[len-1];
    }

    public static void main(String[] args){
        _213_house_robber_II a = new _213_house_robber_II();
        int nums[] = {1, 2, 1, 4, 3};
        System.out.println(a.rob(nums));
    }

}
