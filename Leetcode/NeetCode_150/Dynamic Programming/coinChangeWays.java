class Solution {
    int memo[][];
    public int change(int amount, int[] coins) {
        memo = new int[coins.length+1][amount+1];
        for(int row[] : memo) Arrays.fill(row,-1);
        return changeHelper(coins,amount,0);
    }

    int changeHelper(int coins[],int amount,int index){

        if(amount == 0) return 1;

        if(amount < 0 || index >= coins.length) return 0;

        if(memo[index][amount] != -1) return memo[index][amount];

        int ways = changeHelper(coins,amount-coins[index],index);
        ways += changeHelper(coins,amount,index+1);

        return memo[index][amount] = ways;
    }
}