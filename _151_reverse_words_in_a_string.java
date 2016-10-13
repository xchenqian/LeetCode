import java.lang.StringBuilder;
public class _151_reverse_words_in_a_string{
    public String reverseWords(String s) {
        if(s==null || s.length()==0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i = words.length-1; i>=0; i--){
            if(!words[i].equals("")){
                sb.append(words[i]).append(" ");
            }
        }
        return sb.length()==0?"":sb.substring(0,sb.length()-1);
    }

    public static void main(String[] args){
        _151_reverse_words_in_a_string a = new _151_reverse_words_in_a_string();
        System.out.println("res:"+a.reverseWords("the   blue  sky  "));
    }
}
