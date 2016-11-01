public class InsertionSort{

    public void insertsort(int[] nums){
        for(int i=1; i<nums.length; i++){
        //位置i上的元素存于tmp，其前面所有更大的元素都被向右移动一个位置
            int tmp = nums[i];
            int j;
            for(j=i; j>0 && tmp<nums[j-1]; j--){
                nums[j] = nums[j-1];
            }
            nums[j] = tmp;
        }    
    }

    public static void main(String[] args){
        InsertionSort a = new InsertionSort();
        int[] nums = {2,1,4,3};
        a.insertsort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
