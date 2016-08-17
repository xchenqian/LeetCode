public class _14_longest_common_prefix {

    public String longestCommonPrefix(String[] strs) {
        System.out.println("res:"+strs.length);
        if (strs.length==0) {
            return "";
        }

        int shortLen = strs[0].length();
        String res = strs[0];
        for (int i=1; i<strs.length; i++) {
            if (strs[i].length()<shortLen) {
                shortLen = strs[i].length();
                res = strs[i];
            }
        }

        for (int i=0; i<strs.length; i++) {
            for (int j=0; j<shortLen; j++) {
                if (strs[i].charAt(j)!=res.charAt(j)) {
                    shortLen = j;
                    res = res.substring(0,j); //0~j-1
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        _14_longest_common_prefix a = new _14_longest_common_prefix();  
        //String[] strs ={"abccd","absd","abstract"};
        String[] strs = new String[]{};
        System.out.println("res:"+a.longestCommonPrefix(strs));
    }
    
}