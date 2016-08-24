public class _387_first_unique_character_in_a_string {
    
    public int firstUniqChar(String s) {
        if (s==null) {
            return -1;
        }
        int len = s.length();
        if (len==1) {
            return 0;
        }
        int[] alphabet = new int[26];
        for (int i=0; i<len; i++) {
            alphabet[s.charAt(i)-'a']++;
        }
        for (int i=0; i<len; i++) {
            if (alphabet[s.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;        
    }

    public static void main(String[] args) {
        _387_first_unique_character_in_a_string a = new _387_first_unique_character_in_a_string();  
        
        System.out.println("res:"+a.firstUniqChar("loveleetcode"));
    }
    
}