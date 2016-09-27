public class _137_single_number_II{
    public int singleNumber(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int res=0;
        int[] bits = new int[32];
        for(int i=0; i<32; i++){
            for(int j=0; j< nums.length; j++){
                bits[i] += nums[j]>>i & 1;
            }
            bits[i] %= 3;
            res |= bits[i]<<i;
        }
        return res;
    }
    public static void main(String[] args){
        _137_single_number_II a = new _137_single_number_II();
        int[] nums = {2,2,3,2};
        System.out.println("res:"+a.singleNumber(nums));
    }
}
