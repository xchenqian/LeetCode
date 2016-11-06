public class _96_unique_binary_search_trees{
    public int numTrees(int n) {
        int[] count = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                count[i] += count[j] * count[i-j-1];
            }        
        }
        return count[n];
    }

    public static void main(String[] args){
        _96_unique_binary_search_trees a = new _96_unique_binary_search_trees();
        System.out.println("res: " + a.numTrees(3));
    }
}
