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
    int max =0 ;
    public int maxAncestorDiff(TreeNode root) {
        if(root == null) return 0;
        helper(root , root.val);
        maxAncestorDiff(root.left );
        maxAncestorDiff(root.right);
        return max; 
    }
    public void helper(TreeNode root , int val){
        if(root == null) return ;
        max = Math.max(max , Math.abs(val-root.val));
        helper(root.left , val);
        helper(root.right , val);

    }
}