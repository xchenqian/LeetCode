public class _343_integer_break{
    public int integerBreak(int n) {
        if(n==2 || n==3){
            return n-1;
        }
        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }
        return res*n;
    }

    public static void main(String[] args){
        _343_integer_break a = new _343_integer_break();
        System.out.println("res: " + a.integerBreak(10));
    }
}
