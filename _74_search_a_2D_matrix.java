public class _74_search_a_2D_matrix{

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0, end = rows * columns - 1;
        boolean found = false;

        while(start + 1 < end){
            int mid = start + (end - start)/2;
            int num = matrix[mid / columns][mid % columns];
            if (num < target) {
                start = mid;
            }else if (num > target) {
                end = mid;
            }else {
                found = true;
                break;
            }
        }
        
        if(matrix[start / columns][start % columns] == target){
            found = true;
        }
        if(matrix[end / columns][end % columns] == target){
            found = true;
        }
        
        return found;
    }
    
    public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix == null){
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int i = 0, j = columns - 1;
        boolean found = false;

        while(i < rows && j >= 0){
            if (matrix[i][j] == target) {
                found = true;
                break;
            }else if (matrix[i][j] > target) {
                j--;
            }else{
                i++;
            }
        }
        return found;
    }

    public static void main(String[] args){
        _74_search_a_2D_matrix a = new _74_search_a_2D_matrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println("res: " + a.searchMatrix(matrix, 20));
    }
}
