class Solution {
    public int projectionArea(int[][] grid) {
        int m =grid.length;
        int n=grid[0].length;
        int top = 0;
        int front = 0;
        int side = 0;
        for(int i=0;i<m;i++){
            int maxi = 0;
            int maxj = 0;
            for(int j=0;j<n;j++){
                maxi = Math.max(maxi,grid[i][j]);
                maxj = Math.max(maxj,grid[j][i]);
                if(grid[i][j]!=0) top++;

            }
            front += maxi;
            side += maxj;
        }
        return top+front+side;
    }
}