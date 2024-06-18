class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*
            [1,2,4,6]
            [1,1,2,8]
            [48,24,6,1]
        */
        int n =  nums.length;
        int prefixProduct[] = new int[n];
        int prod = 1;

        for(int i=0;i<n;i++){
            prefixProduct[i] = prod;
            prod = prefixProduct[i] * nums[i];
        }
        int suffixProduct[] = new int[n];
        prod = 1;
        for(int i=n-1;i>=0;i--){
            suffixProduct[i] = prod;
            prod = suffixProduct[i] * nums[i];
            suffixProduct[i] *= prefixProduct[i];
        }

        return suffixProduct;
    }
}
