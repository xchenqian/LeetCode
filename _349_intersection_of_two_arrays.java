import java.util.*;

public class _349_intersection_of_two_arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet set1 = new HashSet();
        HashSet set2 = new HashSet();
        HashSet res = new HashSet();

        if (nums1.length==0 || nums2.length==0) {
        }

        for (int i=0; i<nums1.length; i++) {
            set1.add(nums1[i]);            
        }
        for (int i=0; i<nums2.length; i++) {
            set2.add(nums2[i]);            
        }

        Iterator it1 = set1.iterator();
        while(it1.hasNext()){
            int num1 = (int)it1.next();
            //System.out.println("set1:"+num1);
            Iterator it2 = set2.iterator();
            while(it2.hasNext()){
                int num2 = (int)it2.next();
                //System.out.println("set1:"+num2);
                if (num1==num2) {
                    res.add(num1);
                }
            }
        }

        int len=res.size();
        int[] result = new int[len];
        int pt=0;
        Iterator it = res.iterator();        
        while(it.hasNext()){
            result[pt++]=(int)it.next();
            //System.out.println("res "+it.next());
        }
        return result;
        
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