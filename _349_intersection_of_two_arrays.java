import java.util.*;

public class _349_intersection_of_two_arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int j=0; j<nums2.length; j++){
            if(set.contains(nums2[j])){
                list.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }

        int[] res = new int[list.size()];
        for(int k=0; k<res.length; k++){
            res[k] = list.get(k);
        }

        return res;
    }

    public static void main(String[] args) {
    	_349_intersection_of_two_arrays a=new _349_intersection_of_two_arrays();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = a.intersection(nums1,nums2);

        for (int i=0; i<result.length; i++) {
            System.out.println("result:"+result[i]);
        }
        
    }
}
