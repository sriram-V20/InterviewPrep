class Solution {
    int memo[][];
    public int longestIncreasingPath(int[][] matrix) {
        memo = new int[matrix.length][matrix[0].length];
        for(int row[] : memo) Arrays.fill(row,-1);
        int pathLen = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pathLen = Math.max(pathLen,longestIncreasingPathHelper(matrix,i,j,-1));
            }
        }
        return pathLen;
    }

    int longestIncreasingPathHelper(int matrix[][],int r,int c,int prevCellVal){
        if(r <0 || c< 0 ||r >= matrix.length ||c >= matrix[r].length) return 0;

        if(!(prevCellVal < matrix[r][c])) return 0;

        if(memo[r][c] != -1) return memo[r][c];

        int ways = 0;
        ways = Math.max(ways,1 + longestIncreasingPathHelper(matrix,r+1,c,matrix[r][c]));
        ways = Math.max(ways,1 +  longestIncreasingPathHelper(matrix,r-1,c,matrix[r][c]));
        ways = Math.max(ways,1 + longestIncreasingPathHelper(matrix,r,c+1,matrix[r][c]));
        ways = Math.max(ways,1 + longestIncreasingPathHelper(matrix,r,c-1,matrix[r][c]));

        return memo[r][c] = ways;
    }
}
