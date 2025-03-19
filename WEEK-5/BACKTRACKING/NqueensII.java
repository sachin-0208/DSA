//link:https://leetcode.com/problems/n-queens-ii/description/
import java.util.*;
public class NqueensII {
    private int counter=0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        solve(board,n,0);
        return counter;
    }
    private  void solve(char[][] board,int n,int col){
        if(col==n){
            counter++;
            return;
        }

        for(int i=0;i<n;i++){
            if(isSafe(board,i,col,n)){
                board[i][col]='Q';
                solve(board,n,col+1);
                board[i][col]='.';
            }
        }
    }
    public static boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<col;i++){
            if(board[row][i]=='Q') return false;
        }
       
        for(int i=row,j=col;i>=0 && j>=0;j--,i--){
            if(board[i][j]=='Q') return false;
        }
        
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}
