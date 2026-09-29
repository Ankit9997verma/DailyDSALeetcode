class Solution {
    int prev = -1;
    int answer = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return answer;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != -1) {
            answer = Math.min(answer, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
}
