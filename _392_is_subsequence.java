public class _392_is_subsequence{
    public boolean isSubsequence(String s, String t) {
        if(s==null){
            return true;
        }
        if(t==null | t.length()<s.length()){
            return false;
        }
        int i=0, j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i==s.length();
    }
    public static void main(String[] args){
        _392_is_subsequence a = new _392_is_subsequence();
        System.out.println("res: " + a.isSubsequence("axbc", "ahbgdc"));
    }
}
