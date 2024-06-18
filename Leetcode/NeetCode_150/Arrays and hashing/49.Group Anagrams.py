from collections import defaultdict
from collections.abc import dict_values
from typing import List, Any


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_groups = {}
        def get_sorted_str(s):
            return ''.join(sorted(s))
        for s in strs:
            sorted_str = get_sorted_str(s)
            if sorted_str not in anagram_groups:
                anagram_groups[sorted_str] = []
            anagram_groups[sorted_str].append(s)
        res = []
        for key in anagram_groups:
            res.append(anagram_groups[key])
        return res

    def groupAnagrams(self, strs: List[str]) -> dict_values[Any, list]:
        res = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            res[tuple(count)].append(s)

        return res.values()