class Solution {
    int memo[][];
    public int numDistinct(String s, String t) {
        memo = new int[s.length()+1][t.length()+1];
        for(int row[] : memo) Arrays.fill(row,-1);
        return numDistinctHelper(s,t,0,0);
    }

    int numDistinctHelper(String s,String t,int i,int j){
        if(j == t.length()) return 1;

        if(i >= s.length()) return 0;

        if(memo[i][j] != -1) return memo[i][j];
        int ways = 0;
        if(s.charAt(i) == t.charAt(j)){
            ways += numDistinctHelper(s,t,i+1,j+1);
            ways += numDistinctHelper(s,t,i+1,j);
        }else{
            ways += numDistinctHelper(s,t,i+1,j);
        }
        return memo[i][j] = ways;
    }
}