public class _67_add_binary {
    
    public String addBinary(String a, String b) {        
        if (a.length() < b.length()) {
            String t = a;
            a = b;
            b = t;
        }

        int pa = a.length()-1;
        int pb = b.length()-1;
        int carry = 0, sum =0;
        String res = "";
        while(pb >= 0){
            sum = (int)(a.charAt(pa)-'0') + (int)(b.charAt(pb)-'0') + carry;
            res = String.valueOf(sum%2) + res;
            carry = sum/2;
            pb--;
            pa--;
        }
        while(pa >= 0){
            sum = (int)(a.charAt(pa)-'0') + carry;
            res = String.valueOf(sum%2) + res;
            carry = sum/2;
            pa--;
        }

        if (carry==1) {
            res = '1'+res;
        }
        return res;
    }

    public static void main(String[] args) {
        _67_add_binary a = new _67_add_binary();  
        
        System.out.println("res:"+a.addBinary("1","1"));
    }
    
}