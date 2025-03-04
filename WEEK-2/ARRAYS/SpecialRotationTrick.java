public class SpecialRotationTrick {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        rotate(arr,90);
        System.out.println();
        rotate(arr,180);
        System.out.println();
        rotate(arr,270);
        System.out.println();
        rotate(arr,360);

    }
    public static void rotate(int[][] mat, int degrees){
        int n = mat.length;
        int[][] ra = new int[n][n];
        degrees%=360;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(degrees==90){
                ra[j][n-1-i]=mat[i][j];
            }
            else if(degrees==180){
                ra[n-1-i][n-1-j]=mat[i][j];
            }
            else if(degrees==270){
                ra[n-1-j][i]=mat[i][j];
            }
            else{
                ra[i][j]=mat[i][j];
            }
        }}
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(ra[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
 * Using this we can rotate any matrix without transposing and then reversing the matrix
 * note - this solution is for only those problems where space complexity is not a big problem since here we are
 * not using a inplace rotation method but we are using a new array for storing the results
 */