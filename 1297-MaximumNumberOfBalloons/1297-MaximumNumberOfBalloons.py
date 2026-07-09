# Last updated: 7/9/2026, 9:47:23 AM
class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        f = Counter(text)
        return min(f["b"], f["a"], f["l"] >> 1, f["o"] >> 1, f["n"])