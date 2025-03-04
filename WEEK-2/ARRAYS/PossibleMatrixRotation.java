import java.util.Arrays;

public class PossibleMatrixRotation {
     public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            rotate(mat);
            if(Arrays.deepEquals(mat,target)) return true;
        }
        return false;
    }
    public static int[][] rotate(int[][] mat){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int start = 0;int end=n-1;
            while(start<end){
                int temp = mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=temp;
                start++;
                end--;
            }
        }
        return mat;
    }
}
/*
 * Problem: Given two n x n matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
 * example: Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
 *       Output: true
 *      Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
 * example 2: Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
 *        Output: false
 *      Explanation: It is impossible to make mat equal to target by rotating mat.
 * Constraints:
 * n == mat.length == target.length
 * n == mat[i].length == target[i].length
 * 1 <= n <= 10
 * mat[i][j] and target[i][j] are either 0 or 1.
 * time complexity: O(n^2)
 * space complexity: O(1)
 * optimal approach: Rotate Image
 * 
 */
