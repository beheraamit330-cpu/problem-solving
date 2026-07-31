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
    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null && root.val != val) {

            root = val < root.val ? root.left : root.right;
        }

        return root;
    }
}

// General syntax
// condition ? value1 : value2;

// It is equivalent to:

// if(condition){
//     return value1;
// }
// else{
//     return value2;
// }

// So your line is equivalent to:

// if(val < root.val){
//     root = root.left;
// }
// else{
//     root = root.right;
// }