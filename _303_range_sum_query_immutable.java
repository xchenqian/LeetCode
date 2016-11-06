public class _303_range_sum_query_immutable {
    public int[] sums;
    public _303_range_sum_query_immutable(int[] nums) {
        if(nums==null || nums.length==0){
            sums = new int[0];
        }else{
            sums = new int[nums.length];
            sums[0] = nums[0];
            for(int i=1; i<nums.length; i++){
                sums[i] = sums[i-1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(i==0){
            return sums[j];
        }else{
            return sums[j]-sums[i-1];
        }
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        _303_range_sum_query_immutable a = new _303_range_sum_query_immutable(nums);    
        System.out.println("res: "+a.sumRange(2,5));
    }
}


