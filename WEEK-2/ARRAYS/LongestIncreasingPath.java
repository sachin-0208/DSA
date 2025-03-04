public class LongestIncreasingPath {
    private int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    private int[][] memo;
    public int longestIncreasingPath(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;
       memo = new int[m][n];
       int maxlen = 0;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            maxlen = Math.max(maxlen,dfs(matrix,i,j,m,n));
        }
       }
       return maxlen;
    }
    private int dfs(int[][] mat , int i,int j,int m,int n){
        if(memo[i][j]!=0) return memo[i][j];
        int maxlen = 1;
        for(int[] dir:direction){
            int nr = i+dir[0],nc = j+dir[1];
            if(nr>=0 && nr<m && nc>=0 && nc<n && mat[nr][nc]>mat[i][j]){
                maxlen = Math.max(maxlen,1+dfs(mat,nr,nc,m,n));
            }
        }
        memo[i][j]=maxlen;
        return maxlen;
    }
}
/*
    * Problem: Given an m x n integers matrix, return the length of the longest increasing path in matrix.
    * From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).
    * example: Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
    *          Output: 4
    *          Explanation: The longest increasing path is [1, 2, 6, 9].
    * example 2: Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
    *          Output: 4
    *          explanation: The longest increasing path is [3, 4, 5, 6].
    * example 3: Input: matrix = [[1]]
    *          Output: 1
    *          explanation: The longest increasing path is [1].
    * Constraints:
    * m == matrix.length
    * n == matrix[i].length
    * 1 <= m, n <= 200
    * 0 <= matrix[i][j] <= 231 - 1
    * time complexity: O(m*n)
    * space complexity: O(m*n)
    * optimal approach: Dynamic Programming

 */
