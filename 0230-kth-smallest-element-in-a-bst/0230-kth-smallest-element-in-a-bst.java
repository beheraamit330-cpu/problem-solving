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
    int couter = 0;
    int ans = -1;

    private void fun(TreeNode root) {
        if (root == null || ans != -1)
            return;

        fun(root.left);
        couter--;

        if (couter == 0) {
            ans = root.val;

        }

        fun(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        couter = k;
        fun(root);
        return ans;
    }
}
