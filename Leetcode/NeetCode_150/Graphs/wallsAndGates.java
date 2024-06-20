class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        bfs(grid,queue);
    }

    void bfs(int grid[][],Queue<int[]> queue){
        int m = grid.length,n = grid[0].length;
        int dirs[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        int level = 1;
        boolean visited[][] = new boolean[m][n];
        while(queue.size() != 0){
            int currSize = queue.size();
            for(int i=0;i<currSize;i++){
                int top[] =queue.poll();
                int r = top[0],c = top[1];
                for(int dir[] : dirs){
                    int newRow = r + dir[0];
                    int newCol = c + dir[1];

                    if(newRow < 0 || newCol < 0 || newRow >= m || newCol >= n || visited[newRow][newCol]) continue;
                    if(grid[newRow][newCol] == -1 || grid[newRow][newCol] == 0) continue;

                    visited[newRow][newCol] = true;
                    grid[newRow][newCol] = level;
                    queue.add(new int[]{newRow,newCol});
                }
            }
            level++;
        }
    }
}
