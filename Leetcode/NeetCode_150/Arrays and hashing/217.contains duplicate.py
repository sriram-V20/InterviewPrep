from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        num_set = set(num for num in nums)
        # for num in nums:
        #     if num in num_set:
        #         return True
        #     num_set.add(num)
        #
        # return False

        return len(nums) != len(num_set)
