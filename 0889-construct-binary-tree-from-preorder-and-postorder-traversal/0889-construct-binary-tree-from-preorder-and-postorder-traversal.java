/**
 * Definition for a binary tree node.
 * class TreeNode {
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

    private TreeNode fun(
            int[] preorder, int preStart, int preEnd,
            int[] postorder, int postStart, int postEnd,
            Map<Integer, Integer> map) {

        if (preStart > preEnd || postStart > postEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        // Leaf node
        if (preStart == preEnd)
            return root;

        int leftRoot = preorder[preStart + 1];

        int index = map.get(leftRoot);

        int leftSize = index - postStart + 1;

        root.left = fun(
                preorder,
                preStart + 1,
                preStart + leftSize,
                postorder,
                postStart,
                index,
                map);

        root.right = fun(
                preorder,
                preStart + leftSize + 1,
                preEnd,
                postorder,
                index + 1,
                postEnd - 1,
                map);

        return root;
    }

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }

        return fun(
                preorder,
                0,
                preorder.length - 1,
                postorder,
                0,
                postorder.length - 1,
                map);
    }
}