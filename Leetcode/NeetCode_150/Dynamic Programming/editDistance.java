class Solution {
    int memo[][];

    public int minDistance(String word1, String word2) {
        memo = new int[word1.length()+1][word2.length()+1];
        for(int arr[] : memo){
            Arrays.fill(arr,-1);
        }
        return dp(word1,word2,0,0,word1.length(),word2.length());
    }

    int dp(String word1,String word2,int i,int j,int n,int m){
        if(i == n){
            memo[i][j] = m-j;
            return m - j;
        }

        if(j == m) {
            memo[i][j] = n -i;
            return n - i;
        }

        if(memo[i][j] != -1){
            return memo[i][j];
        }

        int result ;

        if(word1.charAt(i) == word2.charAt(j)){
            memo[i][j] = dp(word1,word2,i+1,j+1,n,m);
            return memo[i][j];
        }else{

            int insert = dp(word1,word2,i+1,j,n,m);
            int del= dp(word1,word2,i,j+1,n,m);
            int replace= dp(word1,word2,i+1,j+1,n,m);
            result = 1 + Math.min(insert,Math.min(del,replace));
        }

        memo[i][j] = result;
        return result;
    }
}
