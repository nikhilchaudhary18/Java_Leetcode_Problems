class Solution {
    public int projectionArea(int[][] grid) {
        int top = 0;
        int front = 0;
        int side = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            int maxi = 0;
            int maxj = 0;
            for(int j=0;j<m;j++){
                maxi = Math.max(maxi,grid[i][j]);
                maxj = Math.max(maxj,grid[j][i]);
                if(grid[i][j]!=0){
                    top++;
                }
            }
            side += maxi;
            front+=maxj;
        }
        return top+front+side;
    }
}