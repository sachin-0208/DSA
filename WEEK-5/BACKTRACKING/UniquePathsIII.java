///link: https://leetcode.com/problems/unique-paths-iii/description/
public class UniquePathsIII {
    public int uniquePathsIII(int[][] grid) {
        int startx=0;
        int starty=0;
        int emptycell=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    startx=i;
                    starty=j;
                }
                else if(grid[i][j]==0){
                    emptycell++;
                }
            }
        }
        return backtrack(grid,startx,starty,emptycell);
    }
    public int backtrack(int[][] board,int x,int y,int emptycell){
        if(x<0 || x>=board.length || y<0 || y>=board[0].length || board[x][y]==-1 ) return 0;
        if(board[x][y]==2){
            return emptycell == 0?1:0;
        }
        board[x][y]=-1;
        int totalpath=0;
        totalpath+=backtrack(board,x+1,y,emptycell-1);
        totalpath+=backtrack(board,x-1,y,emptycell-1);
        totalpath+=backtrack(board,x,y+1,emptycell-1);
        totalpath+=backtrack(board,x,y-1,emptycell-1);
        board[x][y]=0;
        return totalpath;
    }
}
