public class _318_maximum_product_of_word_lengths{
    public int maxProduct(String[] words) {
        int max = 0;
        int len = words.length;
        int[] xor = new int[len];
        for(int i=0; i<len; i++) {
            for(int j=0; j<words[i].length(); j++){
                xor[i] |= 1<<(words[i].charAt(j)-'a');
            }
        }

        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if((xor[i] & xor[j])==0){
                    max = Math.max(words[i].length() * words[j].length(),max);
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        _318_maximum_product_of_word_lengths a = new _318_maximum_product_of_word_lengths();
        String[] words = {"a", "ab", "abc", "d", "cd", "bcd", "abcd"};
        System.out.println("res:"+a.maxProduct(words));    
    }

}
