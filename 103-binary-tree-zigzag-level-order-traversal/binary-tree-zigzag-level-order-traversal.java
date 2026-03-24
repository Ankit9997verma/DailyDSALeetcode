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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level =0 ;
        while(!queue.isEmpty()){
            List<Integer> list1 = new ArrayList<>(); 
            int n = queue.size();
            for(int i =0 ; i< n ; i++){
                TreeNode curr = queue.poll();
                if(level%2 ==0 ){
                    list1.add(curr.val);
                    
                   

                }else{
                    list1.add(0,curr.val);
                }
                
                    if(curr.left != null) queue.add(curr.left);
                    if(curr.right  != null) queue.add(curr.right);
                
            }
            list.add(list1);
            level++;
        }
        return list ;

    }
}