import heapq
from collections import defaultdict
from typing import List


class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        num_count = defaultdict(int)

        for num in nums:
            num_count[num] += 1

        pq = []
        for key in num_count:
            val = num_count[key]
            heapq.heappush(pq, (-val, key))
        res = []
        while pq and k > 0:
            k -= 1
            val, key = heapq.heappop(pq)
            res.append(key)

        return res

    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        freq = [[] for i in range(len(nums) + 1)]

        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)

        res = []
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res