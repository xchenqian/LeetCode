import java.util.*;
public class _78_subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        if(nums==null || len==0){
            return res;
        }

        for(int i=0; i<(1<<len); i++){
            ArrayList<Integer> item = new ArrayList<Integer>();
            for(int j=0; j<len; j++){
                if((i&(1<<j))!=0){
                    item.add(nums[j]);
                }            
            }
            res.add(item);
        }
        return res;
    }
    public static void main(String[] args){
        _78_subsets a = new _78_subsets();
        int[] nums = {1,4,2};
        List<List<Integer>> list = a.subsets(nums);
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size(); j++){
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }

    }
}
