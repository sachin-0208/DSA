// link: https://www.geeksforgeeks.org/n-queens-problem-backtracking-2/
import java.util.*;
public class Nqueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> solution = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        solve(board,solution,n,0);
        return solution;
    }
    public static void solve(char[][] board,List<List<String>> solution,int n,int col){
        if(col==n){
            solution.add(createSolution(board,n));
            return;
        }

        for(int i=0;i<n;i++){
            if(isSafe(board,i,col,n)){
                board[i][col]='Q';
                solve(board,solution,n,col+1);
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
    public static List<String> createSolution(char[][] board,int n){
        List<String> sol = new ArrayList<>();
        for(int i=0;i<n;i++){
            sol.add(new String(board[i]));
        }
        return sol;
    }
}
