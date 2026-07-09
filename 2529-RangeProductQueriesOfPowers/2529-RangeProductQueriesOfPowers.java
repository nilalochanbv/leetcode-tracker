// Last updated: 7/9/2026, 9:46:30 AM
class Solution {
    public int[] productQueries(int n, int[][] queries) {
        String binary = Integer.toBinaryString(n); 
        java.util.List<Long> powers = new java.util.ArrayList<>();

        int len = binary.length();
        for (int i = 0; i < len; i++) {
            if (binary.charAt(len - 1 - i) == '1') {
                powers.add((long) Math.pow(2, i));
            }
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long product = 1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                product = (product * powers.get(j)) % 1000000007L;
            }
            ans[i] = (int) product;
        }
        return ans;
    }
}
