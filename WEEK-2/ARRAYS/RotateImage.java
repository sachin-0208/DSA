public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            int temp  = matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int start = 0,end=n-1;
            while(start<end){
            int temp = matrix[i][start];
            matrix[i][start]=matrix[i ][end];
            matrix[i ][end]= temp;
            start++;
            end--;
            }
        }
        
    }
}
/*
 * Problem: You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * example: Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 *        Output: [[7,4,1],[8,5,2],[9,6,3]]
 * example 2: Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 *       Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * Constraints:
 * matrix.length == n
 * matrix[i].length == n
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 * time complexity: O(n^2)
 * space complexity: O(1)
 * optimal approach: Rotate Image
 */