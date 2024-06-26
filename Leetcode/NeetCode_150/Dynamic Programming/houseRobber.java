class Solution {
    int memo[];
    public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return Math.max(helper(nums,0),helper(nums,1));
    }

    int helper(int nums[],int index){
        if(index >= nums.length) return 0;
        if(memo[index] != -1) return memo[index];
        int way1 = helper(nums,index +1);
        int way2 = helper(nums,index +2) + nums[index];

        return memo[index] = Math.max(way1,way2);
    }
}
