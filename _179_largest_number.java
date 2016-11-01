import java.util.*;
class NumbersComparator implements Comparator<String>{
    public int compare(String s1, String s2){
        return (s2 + s1).compareTo(s1 + s2);
    }   
}

public class _179_largest_number{
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            strs[i] = Integer.toString(nums[i]);           
        }
        Arrays.sort(strs, new NumbersComparator());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.length; i++){
            sb.append(strs[i]);   
        }
        //to avoid all inputs are 0 
        while(sb.length() > 0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args){
        _179_largest_number a = new _179_largest_number();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println("res:" + a.largestNumber(nums));
    }
}
