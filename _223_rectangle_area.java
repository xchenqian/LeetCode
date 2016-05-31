public class _223_rectangle_area {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sum=(C-A)*(D-B)+(G-E)*(H-F);        
        int area=sum;
        if (E>C || F>D || A>G || B>H) {
            area = sum;
        }else{
            area = sum - (Math.min(C,G)-Math.max(A,E))*(Math.min(D,H)-Math.max(F,B));
        }

        return area;
    }

    public static void main(String[] args) {
    	_223_rectangle_area a=new _223_rectangle_area();
        System.out.println("result: "+a.computeArea(-2,-2,2,2,3,3,4,4));                    
    }
}