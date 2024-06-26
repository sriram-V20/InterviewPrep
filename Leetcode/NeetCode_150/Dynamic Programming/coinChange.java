class Solution {
    int memo[];
    public int coinChange(int[] coins, int amount) {
        memo = new int[amount+1];
        Arrays.fill(memo,-1);
        int minCoins = helper(coins,amount);
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    int helper(int coins[],int amount){
        if(amount == 0) return 0;
        if(amount < 0 ) return -1;
        if(memo[amount] != -1) return memo[amount];
        int ways = Integer.MAX_VALUE;
        for(int coin : coins){
            int temp = helper(coins,amount-coin);
            if(temp == -1 || temp == Integer.MAX_VALUE) continue;
            ways = Math.min(1+ temp,ways);
        }
        memo[amount] = ways;
        return ways;
    }
}
