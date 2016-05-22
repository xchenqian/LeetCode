import java.util.Arrays;

public class _169_majority_element {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int res=nums[0];

        for (int i=0; i<len;i++ ) {
            System.out.println(nums[i]);
        }

        int count=1;
        for (int i=0; i<len-1;i++ ) {
            if(nums[i]==nums[i+1]){
                count++;
            }else{
                count=1;
            }
            if(count>len/2){
                res = nums[i];
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
    	_169_majority_element a=new _169_majority_element();
        int[] nums={3,2,3};
        System.out.println("res:"+a.majorityElement(nums));

    }
}