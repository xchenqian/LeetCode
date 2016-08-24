import java.util.*;
public class _38_count_and_say {    

    public String countAndSay(int n) {
        String oldString = "1";        

        while(--n>0){            
            char[] ch = oldString.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i=0;
            while(i<ch.length){
                int count = 1;
                while(i+1<ch.length && ch[i]==ch[i+1]){
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count)+String.valueOf(ch[i]));                
                i++;
            }
            oldString = sb.toString();
        }        
        return oldString;
    }

    public static void main(String[] args) {
        _38_count_and_say a = new _38_count_and_say();  

        System.out.println("res:"+a.countAndSay(5));
    }
    
}