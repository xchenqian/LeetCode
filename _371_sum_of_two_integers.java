public class _371_sum_of_two_integers {

    public int getSum(int a, int b) {
        int sum = a^b;
        int carry = a&b;
        if(carry==0){
            return sum;
        }else{
            return getSum(sum, carry<<1);
        }
    }
    
    public static void main(String[] args) {
        _371_sum_of_two_integers a = new _371_sum_of_two_integers();

        System.out.println(a.getSum(1,4));
    }
    
}