public class _165_compare_version_numbers {

    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int len1 = ver1.length;
        int len2 = ver2.length;

        int i=0;
        while(i<len1 || i<len2){
            int x1 = i<len1 ? Integer.valueOf(ver1[i]):0;
            int x2 = i<len2 ? Integer.valueOf(ver2[i]):0;

            if (x1>x2) {
                return 1;
            }else if (x1<x2) {
                return -1;
            }else{
                i++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        _165_compare_version_numbers a = new _165_compare_version_numbers();  
        //String[] strs ={"abccd","absd","abstract"};
        
        System.out.println("res:"+a.compareVersion("01.5","1"));
    }
    
}