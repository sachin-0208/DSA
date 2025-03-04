public class MatrixDiagnoalSum {
    public int diagonalSum(int[][] mat) {
        int sum  = 0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            if(i!=mat.length-1-i) sum+=mat[i][mat.length-1-i];
        }
        return sum;
    }
}
/*
 * Problem: Given a square matrix mat, return the sum of the matrix diagonals.
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 * example: Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
 *        Output: 25
 *       Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * point to note : The matrix size will be at least 1 and at most 100.
 * time complexity: O(n)
 * space complexity: O(1)
 * optimal approach: Matrix Diagonal Sum
 */