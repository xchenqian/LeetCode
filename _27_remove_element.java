public class _27_remove_element {

    public int removeElement(int[] nums, int val) {
        
        int len = nums.length;
        int j=0;
        for (int i=0; i<len; i++) {
            if (nums[i]!=val) {
                nums[j++] = nums[i];
            }
        }

        return j;
    }

    public static void main(String[] args) {
    	_27_remove_element a=new _27_remove_element();
        int[] nums = {3,2,2,3};
        int val=3;
        System.out.println("res: "+a.removeElement(nums,val));                    
    }
}