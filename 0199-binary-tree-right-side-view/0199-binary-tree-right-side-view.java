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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                // Last node of the current level
                if (i == size - 1)
                    ans.add(node.val);

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);
            }
        }

        return ans;
    }
}


// Approach (BFS + Horizontal Distance)
// Assign every node a Horizontal Distance (HD).
// Root → HD = 0
// Left child → HD - 1
// Right child → HD + 1
// Perform Level Order Traversal (BFS).
// Store the first node encountered for every HD.
// Finally print values from minimum HD to maximum HD.


// Algorithm
// Create a Queue.
// Push (root, 0).
// Create a TreeMap.
// While queue is not empty
// Pop node.
// If HD is not present in map
// Store node value.
// Push left child with HD-1.
// Push right child with HD+1.
// Return values of TreeMap.