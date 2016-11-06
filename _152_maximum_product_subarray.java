public class _152_maximum_product_subarray{
    public int maxProduct(int[] nums) {        
        int res = Integer.MIN_VALUE, max = 1, min = 1;

        for(int i=0; i<nums.length; i++){
            int a = max * nums[i];
            int b = min * nums[i];
            max = Math.max(Math.max(a, b), nums[i]);
            min = Math.min(Math.min(a, b), nums[i]); 
            res = Math.max(res, max);
        }
        return res;
    }

    public static void main(String[] args){
        _152_maximum_product_subarray a = new _152_maximum_product_subarray();
        int[] nums = {-1};
        System.out.println("res: " + a.maxProduct(nums));
    }
}
