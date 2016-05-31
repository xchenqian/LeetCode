public class _9_palindrome_number {

    public boolean isPalindrome(int x) {

        if (x<0) {
            return false;
        }else if(x>0){
            String res = String.valueOf(x);
            for (int i=0,j=res.length()-1; i<j; i++,j--) {
                if (res.charAt(i)!=res.charAt(j)) {
                    return false;
                }
            }
        }
   
        return true;
    }

    public static void main(String[] args) {
    	_9_palindrome_number a=new _9_palindrome_number();
        System.out.println("result: "+a.isPalindrome(123));                    
    }
}