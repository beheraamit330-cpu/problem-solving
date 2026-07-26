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

    private TreeNode buildtrees(
            int[] postorder,
            int postStart,
            int postEnd,
            int[] inorder,
            int inStart,
            int inEnd,
            Map<Integer, Integer> in_map) {

        if (postStart > postEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(postorder[postEnd]);

        int inRoot = in_map.get(root.val);

        int num = inRoot - inStart;

        root.left = buildtrees(
                postorder,
                postStart,
                postStart + num - 1,
                inorder,
                inStart,
                inRoot - 1,
                in_map);

        root.right = buildtrees(
                postorder,
                postStart + num,
                postEnd - 1,
                inorder,
                inRoot + 1,
                inEnd,
                in_map);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer, Integer> in_map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            in_map.put(inorder[i], i);
        }

        return buildtrees(
                postorder,
                0,
                postorder.length - 1,
                inorder,
                0,
                inorder.length - 1,
                in_map);
    }
}