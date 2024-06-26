class Solution {
    public int lengthOfLIS(int[] nums) {
        int memo[] = new int[nums.length];
        Arrays.fill(memo,1);

        for(int i=nums.length-1;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] < nums[j]){
                    memo[i] = Math.max(memo[i],1 + memo[j]);
                }
            }
        }


        return Arrays.stream(memo).max().getAsInt();
    }
}