public class _7_reverse_integer {
    
    public int reverse(int x) {
        int flag=1;
        if(x<0){
            flag=-1;
            x*=flag;
        }
        String str = Integer.toString(x);
        String str_re = "";
        int ans=0;
        try{
            str_re = new StringBuffer(str).reverse().toString();
            ans=(Integer.valueOf(str_re))*flag;
            return ans;
        }catch(NumberFormatException e){
            return 0;
        }        
        
    }

    public static void main(String[] args) {
    	_7_reverse_integer a = new _7_reverse_integer();    	        
    	System.out.println(a.reverse(-123));
    }
}