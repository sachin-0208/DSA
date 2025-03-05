public class MaxAreaIsland {
    public int maxAreaIsland(int[][] land){
        int maxarea=0;
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if(land[i][j]==1) maxarea=Math.max(maxarea,dfs(land,i,j));
            }
        }
        return maxarea;
    }
    public int dfs(int[][] grid,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||j<0||i>=m||j>=n||grid[i][j]==0) return 0;
        grid[i][j]=0;
        return 1+dfs(grid,i+1,j)+dfs(grid,i-1,j)+dfs(grid,i,j+1)+dfs(grid,i,j-1);
    }
}
