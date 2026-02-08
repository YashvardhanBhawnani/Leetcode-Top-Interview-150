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
    int height(TreeNode node) {
        if (node == null)
            return 0;
        int leftD = height(node.left);
        if (leftD == -1)
            return -1;
        int rightD = height(node.right);
        if (rightD == -1)
            return -1;
        if (Math.abs(leftD - rightD) > 1)
            return -1;
        return 1 + Math.max(leftD, rightD);
    }
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
}