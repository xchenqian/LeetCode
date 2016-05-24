public class _36_valid_sudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            //System.out.println("----row "+i+":"+isValid(board,i,i,0,9));
            if (isValid(board,i,i,0,9)==0) {
                return false;
            }
        }
        for (int j=0; j<9; j++) {
            if (isValid(board,0,9,j,j)==0) {
                return false;
            }
        }

        for (int k=0; k<=6; ) {
            for (int t=0; t<=6; ) {
                if (isValid(board,0+k,3+k,0+t,3+t)==0) {
                    return false;
                }
                t=t+3;
            }
            k=k+3;
        }

        return true;
    }

    public int isValid(char[][] board, int rowBegin,int rowEnd, int columnBegin, int columnEnd){
        int[] temp = new int[10];
        if (rowBegin==rowEnd) {
            for (int j=columnBegin; j<columnEnd; j++) {
                if (board[rowBegin][j]!='.') {
                    temp[board[rowBegin][j]-'0']++;
                    //System.out.println("board["+columnBegin+"]["+j+"]:"+board[rowBegin][j]+",count:"+temp[board[rowBegin][j]-'0']);
                    if (temp[board[rowBegin][j]-'0']>1) {
                        return 0;
                    }
                }
            }
        }

        if (columnBegin==columnEnd) {
            for (int i=rowBegin; i<rowEnd; i++) {
                if (board[i][columnBegin]!='.') {
                    temp[board[i][columnBegin]-'0']++;
                    //System.out.println("board["+i+"]["+columnBegin+"]:"+board[i][columnBegin]+",count:"+temp[board[i][columnBegin]-'0']);
                    if (temp[board[i][columnBegin]-'0']>1) {
                        return 0;
                    }
                }
            }
        }

        for (int i=rowBegin; i<rowEnd; i++) {
            for (int j=columnBegin; j<columnEnd; j++) {
                if (board[i][j]!='.') {
                    temp[board[i][j]-'0']++;
                    //System.out.println("board["+i+"]["+j+"]:"+board[i][j]+",count:"+temp[board[i][j]-'0']);
                    if (temp[board[i][j]-'0']>1) {
                        return 0;
                    }
                }
            }
        }

        return 1;
    }

    public static void main(String[] args) {
    	_36_valid_sudoku a=new _36_valid_sudoku();
        char board[][] = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}                        
                        };
        System.out.println("res:"+a.isValidSudoku(board));
    }
}