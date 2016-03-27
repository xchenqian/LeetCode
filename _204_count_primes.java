


public class _204_count_primes {
    public int countPrimes(int n) {
        int i,j,c=0;
    	int prime[]=new int[n];
    	for(i=2;i<n;i++){
    		prime[i]=1;
    	}
    	for(i=2;i*i<n;i++){
        	if(prime[i]==1){
            	for(j=i;j*i<n;j++){
                	prime[j*i]=0;
            	}
        	}        
    	}
    	for(i=2;i<n;i++){
    		if(prime[i]==1){
    		//printf("prime:%d\n", i);
    			c++;
    		}
    	}
    	return c;
    }

    public static void main(String[] args) {
    	_204_count_primes a = new _204_count_primes();
    	int re=a.countPrimes(7);
    	System.out.println(re);
    }
}