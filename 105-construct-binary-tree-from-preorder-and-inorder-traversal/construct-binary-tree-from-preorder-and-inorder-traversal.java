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

    int idx = 0;

    public TreeNode build(int[] preorder, int[] inorder,
                          int start, int end) {


        if (start > end) return null;

    
        int rootVal = preorder[idx];
        idx++;

        TreeNode root = new TreeNode(rootVal);

    
        int i = start;

        while (i <= end) {
            if (inorder[i] == rootVal) break;
            i++;
        }

    
        root.left = build(preorder, inorder, start, i - 1);

      
        root.right = build(preorder, inorder, i + 1, end);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder, inorder, 0, inorder.length - 1);
    }
}