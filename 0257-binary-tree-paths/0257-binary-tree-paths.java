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
import java.util.*;

class Solution {

    private void solve(TreeNode root, List<String> ans, String path) {

        if (root == null)
            return;

        if (path.isEmpty())
            path = String.valueOf(root.val);
        else
            path += "->" + root.val;

        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        solve(root.left, ans, path);
        solve(root.right, ans, path);
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();

        solve(root, ans, "");

        return ans;
    }
}