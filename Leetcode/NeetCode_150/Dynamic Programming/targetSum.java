class Solution {
    HashMap<String,Integer> memo;
    public int findTargetSumWays(int[] nums, int target) {
        memo = new HashMap<>();
        int temp = findTargetSumWaysHelper(nums,target,0,0);
        return temp;
    }

    int findTargetSumWaysHelper(int nums[],int target,int index,int val){

        if(index == nums.length && target == val) return 1;

        if(index >=nums.length) return 0;
        String key = index + "" + val;
        if(memo.containsKey(key)) return memo.get(key);
        int ways = findTargetSumWaysHelper(nums,target,index+1,val+nums[index]);
        ways += findTargetSumWaysHelper(nums,target,index+1,val-nums[index]);

        memo.put(key,ways);
        return ways;

    }
}
