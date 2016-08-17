public class _6_zigzag_conversation {

    public String convert(String s, int numRows) {
        int len = s.length();
        if (len==1 || numRows==1) {
            return s;
        }
        int circle = 2*numRows-2;
        String res = "";

        int i, j, k;
        for (i=0; i<numRows; i++) {
            for (j=i; j<len; j+=circle) {
                res += s.charAt(j);

                if (i>0 && i<numRows-1) {
                    k = j + circle - 2*i;
                    if (k < len) {
                        res += s.charAt(k);   
                    }                    
                }
            }
        }
        return res;        
    }    

    public static void main(String[] args) {
        _6_zigzag_conversation a = new _6_zigzag_conversation();  
        
        System.out.println("res:"+a.convert("A", 1));
    }
    
}