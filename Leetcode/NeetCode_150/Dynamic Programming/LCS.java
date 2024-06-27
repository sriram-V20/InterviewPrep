class Solution {
    int memo[][];
    public int longestCommonSubsequence(String text1, String text2) {
        memo = new int[text1.length()][text2.length()];
        for(int row[] : memo) Arrays.fill(row,-1);
        return lcsHelper(text1,text2,0,0);
    }


    int lcsHelper(String s,String t,int index1,int index2){
        // if(index1 == s.length() && index2 == t.length()) return 0;

        if(index1 >= s.length() || index2 >= t.length()) return 0;

        if(memo[index1][index2] != -1) return memo[index1][index2];

        int res = 0;
        if(s.charAt(index1) == t.charAt(index2)){
            res = Math.max(res,1 + lcsHelper(s,t,index1 + 1,index2 + 1));
            return memo[index1][index2] = res;
        }else{
            res = Math.max(res,lcsHelper(s,t,index1 + 1,index2));
            res = Math.max(res,lcsHelper(s,t,index1 ,index2 + 1));
        }
        return memo[index1][index2] = res;
    }
}
