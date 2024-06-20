class Solution {
    int maxArea = 0;
    boolean marked[][];
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        marked = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && !marked[i][j]){
                    int area = countArea(i,j,grid);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }

    int countArea(int row,int col,int grid[][]){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || marked[row][col] || grid[row][col] == 0) return 0;

        int area = 1;
        marked[row][col] = true;
        area += countArea(row-1,col,grid);
        area += countArea(row+1,col,grid);
        area += countArea(row,col+1,grid);
        area += countArea(row,col-1,grid);

        return area;
    }
}