public class _53_maximum_subarray{
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int b=0;
        for(int i=0; i<nums.length; i++){
            if(b > 0){
                b += nums[i];
            }else{
                b = nums[i];
            }
            max = Math.max(b, max);
        }
        return max;
    }

    public static void main(String[] args){
        _53_maximum_subarray a =  new _53_maximum_subarray();
        //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = {-1};
        System.out.println("res: " + a.maxSubArray(nums));
    }
}
