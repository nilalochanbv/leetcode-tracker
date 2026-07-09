# Last updated: 7/9/2026, 9:48:19 AM
class Solution:
    def findComplement(self, num: int) -> int:
        mask=(1<<num.bit_length())-1
        return num^mask
        
        