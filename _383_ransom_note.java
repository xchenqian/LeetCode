public class _383_ransom_note {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length() ) {
            return false;
        }

        int i,j,k;
        int[] ran = new int[26];
        int[] mag = new int[26];
        for (i=0; i<ransomNote.length(); i++) {
            ran[ransomNote.charAt(i)-'a']++;
        }
        for (j=0; j<magazine.length(); j++) {
            mag[magazine.charAt(j)-'a']++;
        }
        for (k=0; k<26; k++) {
            if (mag[k] < ran[k]) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        _383_ransom_note a = new _383_ransom_note();               
        System.out.println("re:"+a.canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));

    }
    
}