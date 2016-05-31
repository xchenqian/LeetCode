public class _168_excel_sheet_column_title {

    public String convertToTitle(int n) {
        String res = "";
        int remainder;
        while(n!=0){
            remainder=(n-1)%26;
            res = (char)(remainder+'A')+res;
            n=(n-1)/26;
        }
        return res;
    }

    public static void main(String[] args) {
    	_168_excel_sheet_column_title a=new _168_excel_sheet_column_title();
        System.out.println("res: "+a.convertToTitle(54));        
    }
}