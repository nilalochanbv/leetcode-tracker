// Last updated: 7/9/2026, 9:46:58 AM
import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int count = 0;

        for (int cost : costs) {
            if (cost > coins) break;

            coins -= cost;
            count++;
        }

        return count;
    }
}