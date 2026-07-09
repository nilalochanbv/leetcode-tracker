// Last updated: 7/9/2026, 9:49:45 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l=0,h=nums.length;
        return BST(l,h,nums);
    }
    public TreeNode BST(int l, int h, int[]nums){
        if(l>=h) return null;
        int m = l+(h-l)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left=BST(l,m,nums);
        root.right=BST(m+1,h,nums);
        return root;
    }
}