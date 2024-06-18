class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,n = nums.length;
        HashSet<String> triplets = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for(i = 0;i<n-2;i++){
            if(i >0 && nums[i-1] == nums[i]) continue;
            int j=i+1,k = n-1;
            while(j < k ){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    String key = i + "," + j + "," + k;
                    if(!triplets.contains(key)){
                        triplets.add(key);
                        res.add(List.of(nums[i],nums[j],nums[k]));
                    }
                    while( j < n-2 && nums[j] == nums[j+1]) j++;
                    j++;
                    k--;
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}