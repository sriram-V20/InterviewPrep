class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        backtrack(nums,0,target,new ArrayList<>());

        return res;
    }

    void backtrack(int nums[],int index,int target, List<Integer> temp){

        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }

        if(index >= nums.length || target < 0) return;

        temp.add(nums[index]);
        backtrack(nums,index,target-nums[index],temp);
        temp.remove(temp.size()-1);
        backtrack(nums,index+1,target,temp);
    }
}