class Solution {
    int memo[];
    public int numDecodings(String s) {
        memo = new int[s.length()+1];
        Arrays.fill(memo,-1);
        return helper(s,0);
    }

    int helper(String s,int index){
        if(index == s.length()) return 1;
        if(index > s.length()) return 0;
        if(memo[index] != -1) return memo[index];
        if(s.charAt(index) == '0') return 0;

        int way1 = helper(s,index+1);

        if(index + 1 < s.length() && (s.charAt(index)-'0') * 10 + s.charAt(index+1)-'0' <= 26){
            way1 += helper(s,index+2);
        }

        return memo[index] = way1;
    }
}
