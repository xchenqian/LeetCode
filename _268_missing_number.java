import java.util.*;
public class _268_missing_number{
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                return i;   
            }
        }
        return nums.length;
    }
    
    public int missingNumber2(int[] nums) {
        int i=0, len=nums.length;
        while(i<len){
            while(nums[i]!=i && nums[i]<len){
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
            i++;
        }
        for(i=0; i<len; i++){
            if(nums[i]!=i){
                return i;   
            }
        }
        return nums.length;
    }

    public static void main(String[] args){
        _268_missing_number a = new _268_missing_number();
        int[] nums = {3,2,0};
        System.out.println("res:"+a.missingNumber2(nums));
    }  
}
