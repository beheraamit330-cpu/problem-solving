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
    private TreeNode fun(int[] preorder, int bound, int[] i) {
        if (i[0] == preorder.length || preorder[i[0]] > bound)
            return null;
        TreeNode root = new TreeNode(preorder[i[0]++]);

        root.left = fun(preorder, root.val, i);
        root.right = fun(preorder, bound, i);

        return root;

    }

    public TreeNode bstFromPreorder(int[] preorder) {
        return fun(preorder, Integer.MAX_VALUE, new int[] { 0 });
    }
}


/* 
1. Algorithm

Input: preorder[] — preorder traversal of a BST
Output: Root of the constructed BST

Steps
Start with index i = 0.
Call fun(preorder, Integer.MAX_VALUE, i).
In fun():
If all elements are processed, return null.
If preorder[i] > bound, return null.
Create a new node using preorder[i] and increment i.
Construct the left subtree with bound = root.val.
Construct the right subtree with the previous bound.
Return the root node.
Why does bound work?

For a BST:

        root
       /    \
   smaller  greater

For example:

preorder = [8, 5, 1, 7, 10, 12]

When root is 8:

left subtree  → values < 8
right subtree → values > 8

So:

root.left = fun(preorder, root.val, i);

means the left subtree cannot contain values greater than root.val.

And:

root.right = fun(preorder, bound, i);

allows the right subtree to use the parent's upper limit.

2. Approach
Approach: Recursive + Upper Bound

The code uses a recursive preorder traversal with a bound.

The important idea is:

We don't need to search for where the left and right subtrees end. The bound tells us when to stop building the current subtree.

For example:

preorder = [8, 5, 1, 7, 10, 12]

The construction is:

             8
           /   \
          5     10
         / \      \
        1   7      12

The same array index i[0] is shared among all recursive calls.

int[] i = {0};

Why an array?

Java passes primitive int by value. Using int[] allows all recursive calls to modify the same index.

3. Dry Run

For:

preorder = [8, 5, 1, 7, 10, 12]

Initially:

i = 0
bound = ∞
Create 8
root = 8
i = 1

Left:

fun(preorder, 8, i)
Create 5
root = 5
i = 2

Left:

fun(preorder, 5, i)
Create 1
root = 1
i = 3

Next value is 7.

Since:

7 > 1

return null.

Now try right subtree of 1:

7 > 1

again return null.

So:

1

is complete.

Then return to 5.

Next value is 7.

Since:

7 < 8

it belongs to the right subtree of 5.

    5
   / \
  1   7

Then return to 8.

Next value is 10.

Since:

10 > 8

it cannot belong to 8's left subtree.

It becomes the right subtree:

      8
     / \
    5   10
   / \    \
  1   7    12

  Time Complexity: O(n)

  */

