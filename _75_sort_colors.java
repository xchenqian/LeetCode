import java.util.*;
public class _75_sort_colors{

    private void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void sortColors(int[] nums) {
        if(nums==null || nums.length<=1){
            return;
        }
        int left = 0, right = nums.length-1;
        int i=0;
        while(i<=right){
            if(nums[i]==0){
                swap(nums, i, left);
                left++;
                i++;
            }else if(nums[i]==1){
                i++;
            }else{
                swap(nums, i, right);
                right--;
            }
        }
    }

    private void quicksort(int[] nums, int left, int right){
        if(left >= right){
            return;
        }
        int i = left, j = right;
        int pivot = nums[(left + right)/2];

        while(i<=j){
            while(i<=j && nums[i]<pivot){
                i++;
            }
            while(i<=j && nums[j]>pivot){
                j--;
            }
            if(i<=j){
                swap(nums, i, j);
                i++;
                j--;
            }
        }

        quicksort(nums, left, j);
        quicksort(nums, i, right);
    }

    public void sortColors2(int[] nums) {
        quicksort(nums, 0, nums.length-1);       
    }

    public static void main(String[] args){
        _75_sort_colors a = new _75_sort_colors();
        int[] nums = {1,0,2};
        a.sortColors2(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);   
        }
    }
}
