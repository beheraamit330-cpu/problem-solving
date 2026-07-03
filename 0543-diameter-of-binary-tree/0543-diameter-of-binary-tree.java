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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];
    }

    private int height(TreeNode root, int[] diameter) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);

        return 1 + Math.max(lh, rh);

    }
}

/**
Approach: Diameter of Binary Tree
Intuition

The diameter of a binary tree is the length of the longest path between any two nodes in the tree. This path may or may not pass through the root.

To find the diameter efficiently, we calculate the height of every subtree. At each node, the longest path passing through that node is the sum of:

Height of the left subtree (lh)
Height of the right subtree (rh)

So, the diameter passing through a node is:

Diameter = Left Height + Right Height

We keep track of the maximum such value while traversing the tree.
**/