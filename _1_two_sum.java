public class _1_two_sum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int len=nums.length;
        if (len<=1) {
            return res;
        }

        for (int i=0;i<len-1;i++) {
            for (int j=i+1;j<len ;j++ ) {
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
    	_1_two_sum a=new _1_two_sum();
        int[] nums={-1,-2,-3,-4,-5};
        int target=-8;
        int[] res = new int[2];
        res=a.twoSum(nums,target);
        for (int i=0;i<res.length ; i++) {
            System.out.println(res[i]);
        }
    }
    
}