class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = maxProd * nums[i];
            maxProd = Math.max(Math.max(nums[i] * maxProd,nums[i] * minProd),nums[i]);
            minProd = Math.min(Math.min(temp,nums[i] * minProd),nums[i]);

            res = Math.max(res,maxProd);

        }

        return res;
    }
}