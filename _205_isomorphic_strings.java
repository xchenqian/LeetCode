
import java.util.HashMap;

public class _205_isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        int i;
        if(s.isEmpty()||t.isEmpty()){
    		return true;
    	}
    	if(s.length() != t.length()){
    		return false;
    	}
    	HashMap<Character,Character> map = new HashMap<Character,Character>();
        for(i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(!map.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }else if(map.containsValue(t.charAt(i))){
                return false;
            }else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
    	_205_isomorphic_strings a = new _205_isomorphic_strings();
    	String s = "";
    	String t = "";
    	System.out.println(a.isIsomorphic(s,t));
    }
}