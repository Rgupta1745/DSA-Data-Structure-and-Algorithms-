class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        if (grid==null || grid.length==0) {
            return 0;
            
        }
        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;
        int maxArea = 0;

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                if (grid[i][j]==1) {
                    count++;
                    int area =dfs(grid,i,j);
                    maxArea = Math.max(maxArea , area);
                    
                }
                
            }
            
        }
        return maxArea;
        
    }

    private int dfs(int[][] grid,int i,int j){
        int rows=grid.length;
        int cols=grid[0].length;
        int area = 1;

        if (i<0 || j<0 || i>=rows || j>=cols || grid[i][j]==0) {
            return 0;
            
        }

        grid[i][j]=0;

        return 1 + dfs(grid, i-1, j) + dfs(grid, i+1, j) + dfs(grid, i, j-1) + dfs(grid, i, j+1);


    }
}
