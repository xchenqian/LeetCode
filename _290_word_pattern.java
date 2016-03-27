import java.util.HashMap;

public class _290_word_pattern {
    public boolean wordPattern(String pattern, String str) {
    	int i;
    	if(pattern.isEmpty()||str.isEmpty()){
    		return false;
    	}
    	String[] s = str.split(" ");
    	if(s.length != pattern.length()){
    		return false;
    	}
        HashMap<Character,String> map = new HashMap<Character,String>();
        for(i=0;i<pattern.length();i++){
        	if(map.containsKey(pattern.charAt(i))){
        		if(!map.get(pattern.charAt(i)).equals(s[i])){
        			return false;
        		}
        	}else if(map.containsValue(s[i])){
        		return false;
        	}else{
        		map.put(pattern.charAt(i),s[i]);
        	}
        }
        return true;
    }

    public static void main(String[] args) {
    	_290_word_pattern a = new _290_word_pattern();
    	String pattern = "abba";
    	String str = "dog doe cat dog";
    	System.out.println(a.wordPattern(pattern,str));
    }
}