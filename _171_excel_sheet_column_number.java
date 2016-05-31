public class _171_excel_sheet_column_number {

    public int titleToNumber(String s) {
        int sum=0, len=s.length();
        
        for (int i=0; i<len; i++) {
            sum+=Math.pow(26,len-i-1)*(s.charAt(i)-'A'+1);
        }
        return sum;
    }

    public static void main(String[] args) {
    	_171_excel_sheet_column_number a=new _171_excel_sheet_column_number();
        System.out.println("res: "+a.titleToNumber("BB"));                    
    }
}