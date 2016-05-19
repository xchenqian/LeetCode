public class _344_reverse_string {
    
    public String reverseVowels(String s) {
        int i,j;  
        int len =s.length();  
        if(len<=1){
            return s;
        }
        char[] temp = new char[len];
        for(i=len-1; i>=0; i--){
        	temp[len-1-i] = s.charAt(i);
        }

        String reverse = String.valueOf(temp);
        return reverse;
        
    }


    public static void main(String[] args) {
    	_344_reverse_string a = new _344_reverse_string();    	        
    	System.out.println(a.reverseVowels("hello"));
    }
}