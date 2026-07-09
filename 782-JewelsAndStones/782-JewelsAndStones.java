// Last updated: 7/9/2026, 9:47:37 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char s : stones.toCharArray()) {
            for (char j : jewels.toCharArray()) {
                if (s == j) {
                    count++;
                    break; 
                }
            }
        }
        return count;
    }
}