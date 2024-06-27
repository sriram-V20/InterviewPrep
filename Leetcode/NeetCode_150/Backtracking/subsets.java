class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>());
        return res;
    }

    void backtrack(int nums[],int index,List<Integer> temp){
        if(index == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        backtrack(nums,index+1,temp);
        temp.remove(temp.size()-1);
        backtrack(nums,index+1,temp);

    }
}