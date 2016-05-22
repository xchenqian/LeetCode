public class _70_climbing_stairs {

    public int climbStairs(int n) {        
        if (n<=0 || n==1) {
            return 1;
        }

        int[] res = new int[n+1];
        res[0] = res[1] =1;
        for (int i=2; i<=n; i++) {
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];
    }

    public static void main(String[] args) {
    	_70_climbing_stairs a=new _70_climbing_stairs();
        System.out.println(a.climbStairs(5));
    }
}