public class _345_reverse_of_a_string {
    
    public String reverseVowels(String s) {
        int i,j;  
        int len =s.length();  
        if(len<=1){
            return s;
        }
        char[] temp = new char[len];
        for (i=0, j=s.length()-1; i<=j; ) {
            char front = s.charAt(i);
            char behind = s.charAt(j);
            if(isVowel(front) !=1){
                temp[i]=front;
                i++;
            }
            if(isVowel(behind)!=1){
                temp[j]=behind;
                j--;
            }
            if( isVowel(front)==1 && isVowel(behind)==1){
                temp[i]=s.charAt(j);
                temp[j]=s.charAt(i);
                i++;
                j--; 
            }
            
        }
        String reverse = String.valueOf(temp);
        return reverse;
        
    }

    public int isVowel(char c){
        if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
    	_345_reverse_of_a_string a = new _345_reverse_of_a_string();    	        
    	System.out.println(a.reverseVowels("leetcode"));
    }
}