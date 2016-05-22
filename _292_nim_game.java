public class _292_nim_game {
    
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
    	_292_nim_game a = new _292_nim_game();    	        
    	System.out.println(a.canWinNim(8));
    }
}