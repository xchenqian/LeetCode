import java.util.*;

public class _350_intersection_of_two_arrays_2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i],map.get(nums1[i])+1 );
            }else{
                map.put(nums1[i], 1);
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        for(int j=0; j<nums2.length; j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j])>0){
                list.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j])-1);
            }
        }

        int[] res = new int[list.size()];
        for(int k=0; k<list.size(); k++){
            res[k] = list.get(k);
        }

        return res;
    }

    public static void main(String[] args) {
    	_350_intersection_of_two_arrays_2 a=new _350_intersection_of_two_arrays_2();
        int[] nums1 = {1,2,2,1,1};
        int[] nums2 = {1,1};
        int[] result = a.intersect(nums1,nums2);
        
        System.out.println("res:");
        for (int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
        
    }
}
