// Last updated: 7/9/2026, 9:49:41 AM
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null)
            return targetSum == root.val;
        return hasPathSum(root.left,  targetSum - root.val)
            || hasPathSum(root.right, targetSum - root.val);
    }
}