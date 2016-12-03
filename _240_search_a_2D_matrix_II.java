public class _240_search_a_2D_matrix_II{
    public boolean searchMatrix(int[][] matrix, int target) {
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
        _240_search_a_2D_matrix_II a = new _240_search_a_2D_matrix_II();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        System.out.println("res: " + a.searchMatrix(matrix, 21));
    }
}
