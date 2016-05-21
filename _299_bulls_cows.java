public class _299_bulls_cows {
    
    public String getHint(String secret, String guess) {
        int bulls=0, cows=0;
        int len =guess.length();
        if(len<=0){
            return "";
        }


        int[] temp = new int[10];
        for(int k=0;k<10;k++){
            temp[k]=0;
        }

        for(int i=0;i<len;i++){
            char guessChar=guess.charAt(i);
            char secretChar=secret.charAt(i);

            if(guessChar==secretChar){
                bulls++;
                continue;
            }

            temp[guessChar-'0']++;
            if(temp[guessChar-'0']<=0){
                cows++;
            }
            
            temp[secretChar-'0']--;
            if(temp[secretChar-'0']>=0){
                cows++;
            }            
        }
        String re=bulls+"A"+cows+"B";
        return re;
    }

    public static void main(String[] args) {
    	_299_bulls_cows a = new _299_bulls_cows();    	        
    	System.out.println(a.getHint("1123","0111"));
    }
}