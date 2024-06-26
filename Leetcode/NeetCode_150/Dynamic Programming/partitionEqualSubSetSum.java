class Solution {
    boolean memo[];
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if(sum % 2 != 0) return false;
        memo = new boolean[nums.length];
        Arrays.fill(memo,false);
        return canPartitionHelper(nums,0,sum/2);
    }

    boolean canPartitionHelper(int nums[],int index,int sum){
        if(index == nums.length && sum == 0) return true;
        if(sum < 0 | index == nums.length) return false;
        if(memo[index]) return memo[index];
        boolean res = canPartitionHelper(nums,index+1,sum-nums[index]);
        res |= canPartitionHelper(nums,index+1,sum);
        memo[index] = res;
        return res;

    }
}