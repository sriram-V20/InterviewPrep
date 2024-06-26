class Solution {
    int memo[][];
    public int countSubstrings(String s) {
        int count = 0;
        memo = new int[s.length()+1][s.length()+1];
        for(int row[] : memo) Arrays.fill(row,-1);
        int res[] = new int[]{-1,-1,-1};
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && isPalindrome(s,i+1,j-1)){
                    count++;
                }
            }
        }
        return count;
    }

    boolean isPalindrome(String s,int l,int r){
        if(l > r) return true;
        if(memo[l][r] != -1) return memo[l][r] == 1 ? true : false;
        memo[l][r] =  s.charAt(l) == s.charAt(r) && isPalindrome(s,l+1,r-1) ? 1 : 0;
        return memo[l][r] == 1 ? true : false;
    }
}
