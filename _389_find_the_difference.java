
public class _389_find_the_difference {

    public char findTheDifference(String s, String t) {
        int letterOfS[] = new int[26];
        int letterOfT[] = new int[26];
        
        for(int i=0; i<s.length(); i++){
            letterOfS[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            letterOfT[t.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(letterOfS[i]!=letterOfT[i]){
                return (char)('a'+i);
            }
        }
        return 'a';
    }
    
    public static void main(String[] args) {
        _389_find_the_difference a = new _389_find_the_difference();        
        System.out.println("res: "+a.findTheDifference("abcd","abcde"));
    }
    
}