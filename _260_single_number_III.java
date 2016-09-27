public class _260_single_number_III{
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        if(nums==null || nums.length==0){
            return res;
        }
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor ^= nums[i];
        }
        
        int a=0, b=0;
        //int lastBit = xor - (xor & (xor-1));
        int lastBit = xor & (-xor);
        for(int i=0; i<nums.length; i++){
            if((nums[i] & lastBit)==0){
                a ^= nums[i];     
            }else{
                b ^= nums[i];
            }
        }
        res[0] = a;
        res[1] = b;
        return res; 
    }
    public static void main(String[] args){
        _260_single_number_III a = new _260_single_number_III();
        int[] nums = {2,2,3,1,2,1};
        int[] res = a.singleNumber(nums);
        for(int i=0; i<res.length; i++){ 
             System.out.println("res:"+res[i]);
        }
    }

}
