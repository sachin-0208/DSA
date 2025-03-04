public class TransposeOfMatrix {
    
    // for any matrix
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transpose = new int[col][row];  // New matrix with swapped dimensions

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];  // Swap elements
            }
        }
        return transpose;
    }
    // for square matrix
    public int[][] transposeSquareMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  // Swap only upper triangle elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
/*
 * Problem: Given a matrix A, return the transpose of A.
 * The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.   
 * example: Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 *         Output: [[1,4,7],[2,5,8],[3,6,9]]
 * example 2: Input: matrix = [[1,2,3],[4,5,6]]
 *        Output: [[1,4],[2,5],[3,6]]
 * Constraints:
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 * time complexity: O(m*n)
 *  
 * space complexity: O(m*n)
 * optimal approach: Transpose of a matrix
 * 
 */