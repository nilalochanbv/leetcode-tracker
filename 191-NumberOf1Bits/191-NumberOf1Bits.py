# Last updated: 7/9/2026, 9:49:17 AM
class Solution:
    def hammingWeight(self, n: int) -> int:
        res = 0

        num = n
        while num:
            res += num & 1
            num = num >> 1
        
        return res