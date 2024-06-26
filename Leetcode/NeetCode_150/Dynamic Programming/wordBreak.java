class Solution {
    HashSet<String> words;
    int memo[];
    public boolean wordBreak(String s, List<String> wordDict) {
        words = new HashSet<>(wordDict);
        memo = new int[s.length()+1];
        Arrays.fill(memo,-1);
        return helper(s,0);
    }

    boolean helper(String s,int index){
        if(index == s.length()) return true;
        if(memo[index] != -1) return memo[index] == 1 ? true : false;
        StringBuilder sb = new StringBuilder();
        boolean wordBreakPossible = false;
        for(int i=index;i<s.length();i++){
            sb.append(s.charAt(i));
            if(words.contains(sb.toString())){
                wordBreakPossible |= helper(s,i+1);
            }
        }
        memo[index] = wordBreakPossible ? 1 : 0;
        return wordBreakPossible;
    }
}
