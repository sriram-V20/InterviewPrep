from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        num_map = {}
        # print(num_count)
        for i in range(0,len(nums)):
            num_map[nums[i]] = i
        for i in range(0,len(nums)):
            if target - nums[i] in num_map and i != num_map[target - nums[i]]:
                return [i,num_map[target - nums[i]]]
        return [0,0]