class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int arr1[] = new int[nums.length-1];
        int arr2[] = new int[nums.length-1];
        for(int i=1;i<nums.length;i++){
            arr1[i-1] = nums[i];
            arr2[i-1] = nums[i-1];
        }
        int memo[] = new int[nums.length];
        Arrays.fill(memo,-1);
        int res = helper(arr1,0,memo);
        Arrays.fill(memo,-1);
        res = Math.max(res,helper(arr2,0,memo));

        return res;
    }

    int helper(int nums[],int index,int memo[]){
        if(index >= nums.length) return 0;
        if(memo[index] != -1) return memo[index];
        int way = helper(nums,index+1,memo);
        way = Math.max(way,helper(nums,index+2,memo) + nums[index]);

        return memo[index] = way;
    }
}
