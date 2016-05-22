public class _231_power_of_two {
    public boolean isPowerOfTwo(int n) {
    	if(n<=0) return false;
    	if(n==1) return true;
        while(n>1){
        	if(n%2 != 0) return false;
        	n=n/2;
        }
        return true;
    }

    public static void main(String[] args) {
    	_231_power_of_two a=new _231_power_of_two();
    	System.out.println(a.isPowerOfTwo(0));
    }
}