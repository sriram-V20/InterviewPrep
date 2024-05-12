class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # s_char_map = {}
        # t_char_map = {}
        # for char in s:
        #     if char not in s_char_map:
        #         s_char_map[char] = 0
        #     s_char_map[char] += 1
        # for char in t:
        #     if char not in t_char_map:
        #         t_char_map[char] = 0
        #     t_char_map[char] += 1

        # if len(s_char_map) != len(t_char_map):
        #     return False

        # for key in s_char_map:
        #     if key not in t_char_map or t_char_map[key] != s_char_map[key]:
        #         return False

        return sorted(s) == sorted(t)