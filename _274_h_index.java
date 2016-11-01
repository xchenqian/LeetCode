import java.util.*;
public class _274_h_index{
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int res = 0;
        for(int i=0; i<citations.length; i++){
            int curH = Math.min(citations[i], citations.length-i);
            if(curH > res){
                res = curH;
            }
        }
        return res;
    }
    public static void main(String[] args){
        _274_h_index a = new _274_h_index();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println("res: " + a.hIndex(citations));
    }
}
