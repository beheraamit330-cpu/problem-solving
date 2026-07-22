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

    private TreeNode buildtrees(int[] preorder,
            int preStart,
            int preEnd,
            int[] inorder,
            int inStart,
            int inEnd,
            Map<Integer, Integer> in_map) {

        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int in_root = in_map.get(root.val);

        int num = in_root - inStart;

        root.left = buildtrees(preorder,
                preStart + 1,
                preStart + num,
                inorder,
                inStart,
                in_root - 1,
                in_map);

        root.right = buildtrees(preorder,
                preStart + num + 1,
                preEnd,
                inorder,
                in_root + 1,
                inEnd,
                in_map);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> in_map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            in_map.put(inorder[i], i);
        }

        return buildtrees(preorder,
                0,
                preorder.length - 1,
                inorder,
                0,
                inorder.length - 1,
                in_map);
    }
}