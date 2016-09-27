public class _338_counting_bits{
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=0; i<=num; i++){
            for(int j=0; j<32; j++){
                if((i>>j & 1)==1){
                    res[i]++;
                }
            }
        }
        return res;
    }

    public int[] countBits2(int num){
        int[] res = new int[num+1];
        res[0] = 0;
        int base = 1;
        while(base<=num){
            int next = base * 2;
            for(int i=base; i<next && i<=num; i++){
                res[i] = res[i-base] + 1;
            }
            base = next;
        }
        return res;
    }

    public int[] countBits3(int num){
        int[] res = new int[num+1];
        res[0] = 0;
        res[1] = 1;
        for(int i=2; i<=num; i++){
            res[i] = res[i&(i-1)] + 1;
        }
        return res;
    }
    public static void main(String[] args){
        _338_counting_bits a = new _338_counting_bits();
        int[] res = a.countBits2(5);
        for(int i=0; i<res.length; i++){    
            System.out.println("res["+i+"]:"+res[i]);
        }
    } 
}
