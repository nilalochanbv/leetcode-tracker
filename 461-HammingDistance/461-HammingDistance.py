# Last updated: 7/9/2026, 9:48:22 AM
class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        xor=x^y
        return bin(xor).count('1')
        