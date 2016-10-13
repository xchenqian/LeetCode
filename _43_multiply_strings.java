public class _43_multiply_strings{
    public String multiply(String num1, String num2) {
        num1 =  new StringBuilder(num1).reverse().toString();
        num2 =  new StringBuilder(num2).reverse().toString();
        int[] res = new int[num1.length() + num2.length()];
        
        for(int i=0; i<num1.length(); i++){
            int a = Character.getNumericValue(num1.charAt(i));
            for(int j=0; j<num2.length(); j++){
                int b = Character.getNumericValue(num2.charAt(j));
                res[i+j] += a * b;
            }
        }
    
        StringBuilder sb = new StringBuilder();
        for(int k=0; k<res.length; k++){
            int digit = res[k] % 10;
            int carry = res[k] / 10;
            sb.insert(0, digit);
            if(k < res.length-1){
                res[k+1] += carry;
            }
        }

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        
        return sb.length()==0 ? "0" : sb.toString();
    }

    public static void main(String[] args){
        _43_multiply_strings a = new _43_multiply_strings();
        System.out.println("res:"+a.multiply("24","24"));
    } 

}
