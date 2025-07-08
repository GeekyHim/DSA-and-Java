

public class NQueens {
    
}


class Solution {

    public List<String> makeString(char[][] board, int size){
        List<String> L = new ArrayList<>();
        for(int i =0; i<size; i++){
            String row = new String(board[i]);
            L.add(row);
        }
        return L;
    }

    public boolean isSafe(int row, int col ,int size ,char [][] board){
        // since we are going in a new row everytime, no need to check row

        //check vertically 
        for(int i = row; i>=0; i--){
            if(board[i][col]=='Q') return false;
        }

        //check left side digonal
        int leftSide = Math.min(row, col);
        for(int j = 1; j<= leftSide;j++ ){
            if(board[row-j][col-j]=='Q') return false;
        } 

        //check right side diagonal
        int rightSide = Math.min(row, size-1-col);
        for(int k = 1;k<=rightSide; k++){
            if(board[row-k][col+k]=='Q') return false;
        }

        // all possible falses check 
        return true;
    }

    public void placeQueens(int row ,int size ,char [][] board , List<List<String>> ans){
        //base case
        if(row==size){ 
            ans.add(makeString(board, size));
            return;
        }

        //backtracking and placing queens
        for(int col=0; col<size; col++){
            if(isSafe(row, col, size, board)){
                board[row][col] = 'Q';
                placeQueens(row+1, size, board, ans);
                board[row][col] = '.'; //backtracking
            }
        }

    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        
        char [][] board = new char [n][n];
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        placeQueens(0, n, board, ans);
        
        return ans;
    }
}
