// Last updated: 7/9/2026, 9:45:25 AM
class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> result = new ArrayList<>();
        backtrack(0, 0, new StringBuilder(), n, k, result);
        return result;
    }

    private void backtrack(int index, int currentCost, StringBuilder sb, int n, int k, List<String> result) {
        if (index == n) {
            result.add(sb.toString());
            return;
        }
        sb.append('0');
        backtrack(index + 1, currentCost, sb, n, k, result);
        sb.deleteCharAt(sb.length() - 1); 
        boolean noConsecutiveOne = (sb.length() == 0 || sb.charAt(sb.length() - 1) != '1');
        boolean withinCostLimit = (currentCost + index <= k);

        if (noConsecutiveOne && withinCostLimit) {
            sb.append('1');
            backtrack(index + 1, currentCost + index, sb, n, k, result);
            sb.deleteCharAt(sb.length() - 1); 
        }
    }
}