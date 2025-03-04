public class CelebrityCheck {
    public int celebrityCheck(int[][] mat){
        int n = mat.length;
        int candidate=0;
        for(int i=1;i<n;i++){
            if(mat[candidate][i]==1) candidate=i;
        }
        if(isCandidate(mat,candidate,n)) return candidate;
        return -1;
    }
    public boolean isCandidate(int[][] mat,int candidate,int n){
        for(int i=0;i<n;i++){
            if(i!=candidate){
            if(mat[candidate][i]==1 || mat[i][candidate]==0) return false;
        }}
        return true;
    }
}
/*
 * note - main point is the for a celebrity all the numbes in the same row should be 0(Except celeb itself) and in the same column should be 1
 * ps - 
 * You are given an N × N matrix M, where:

M[i][j] == 1 → Person i knows Person j
M[i][j] == 0 → Person i does NOT know Person j
A celebrity is defined as someone who:

Does NOT know anyone else → Their row (except themselves) must be all 0s.
Is known by everyone → Their column (except themselves) must be all 1s.
Task
Find the celebrity (if one exists) and return their index. If no celebrity exists, return -1.

Constraints
1 ≤ N ≤ 10^3
M[i][j] is either 0 or 1.
M[i][i] == 1 (A person knows themselves).
 */