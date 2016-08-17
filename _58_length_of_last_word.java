public class _58_length_of_last_word {

    public int lengthOfLastWord(String s) {
        if (s.length()==0) {
            return 0;
        }
        String[] words = s.split(" ");
        if (words.length==0) {
            return 0;
        }
        return words[words.length-1].length();
    }

    public static void main(String[] args) {
        _58_length_of_last_word a = new _58_length_of_last_word();  
        
        System.out.println("res:"+a.lengthOfLastWord(" "));
    }
    
}