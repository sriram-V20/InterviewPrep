class Solution {
    int memo[] = new int[31];
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        if(memo[n] != 0) return memo[n];
        return memo[n] = climbStairs(n-1) + climbStairs(n-2);
    }
}
