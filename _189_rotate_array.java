public class _189_rotate_array {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        int[] temp = new int[len]; 
        System.arraycopy(nums, 0, temp, 0, len);

        int pt=0;
        for(int i=len-k; i<len; i++){
            nums[pt++] = temp[i];
        }
        for(int i=0; i<len-k; i++){
            nums[pt++] = temp[i];
        }
    }

    public static void main(String[] args) {
    	_189_rotate_array a=new _189_rotate_array();
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        
        a.rotate(nums,k);

    }
}