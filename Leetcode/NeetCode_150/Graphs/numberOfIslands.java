class Solution {
    boolean marked[][];
    public int numIslands(char[][] grid) {
        marked = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!marked[i][j] && grid[i][j] == '1'){
                    count++;
                    mark(i,j,grid);
                }
            }
        }
        return count;
    }

    void mark(int row,int col, char grid[][]){
        if(row <0 || row >= grid.length || col < 0 || col >= grid[0].length || marked[row][col] || grid[row][col] == '0') return;
        marked[row][col] = true;
        mark(row-1,col,grid);
        mark(row+1,col,grid);
        mark(row,col+1,grid);
        mark(row,col-1,grid);
    }
}