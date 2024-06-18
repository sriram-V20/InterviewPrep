class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int maxWater = -1;
        while(l < r){
            int currWater = Math.min(heights[l],heights[r]) * (r-l);
            maxWater = Math.max(maxWater,currWater);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}
