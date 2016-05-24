import java.util.*;

public class _349_intersection_of_two_arrays_2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);        

        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList res = new ArrayList();

        int count1=1;
        for (int i=0; i<nums1.length; i++) {            
            if (i<nums1.length-1) {
                if(nums1[i]==nums1[i+1]){                
                count1++;
                }else{                
                    map1.put(nums1[i],count1);
                    count1=1;
                }
            }else{
                map1.put(nums1[i],count1);
            }                        
        }    

        int count2=1;
        for (int i=0; i<nums2.length; i++) {        
            if (i<nums2.length-1) {
                if(nums2[i]==nums2[i+1]){                
                count2++;
                }else{                
                    map2.put(nums2[i],count2);
                    count2=1;
                }
            }else{
                map2.put(nums2[i],count2);
            }                        
        }  

          
        Iterator iter1 = map1.keySet().iterator();  
        while (iter1.hasNext()) {  
            int key1 = (int) iter1.next();  
            int value1 = (int) map1.get(key1); 
            Iterator iter2 = map2.keySet().iterator();  
            while (iter2.hasNext()) {  
                int key2 = (int) iter2.next();  
                int value2 = (int) map2.get(key2); 
                if (key2==key1 && value1==value2) {
                    while(value1>0){
                        value1--;
                        res.add(key1); 
                    }                                         
                     break;
                 } else if(key2==key1 && value1<value2){
                     while(value1>0){
                        value1--;
                        res.add(key1); 
                    }                                         
                     break;
                 }  else if(key2==key1 && value1>value2){
                     while(value2>0){
                        value2--;
                        res.add(key1); 
                    }                                         
                     break;
                 }                         
            }             
        } 

        int len=res.size();        
        int[] result = new int[len];
        int pt=0;

        Iterator it = res.iterator();        
        while(it.hasNext()){
            //System.out.println("res "+(int)it.next());
            result[pt++]=(int)it.next();            
        }

        return result;
    }

    public static void main(String[] args) {
    	_349_intersection_of_two_arrays_2 a=new _349_intersection_of_two_arrays_2();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {1,1};
        int[] result = a.intersect(nums1,nums2);

        for (int i=0; i<result.length; i++) {
            System.out.println("result:"+result[i]);
        }
        
    }
}