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
    public int cal(TreeNode root, int max)
    {
        if(root == null) return 0;
        
        int left = 0;
        int right =0;
        
        left = cal(root.left , root.val>max ? root.val : max);
        right = cal(root.right, root.val>max ? root.val : max );

        if(root.val>=max) return 1+left+right;

        return right+left;
        
    }
    public int goodNodes(TreeNode root) {
        return cal(root,Integer.MIN_VALUE);
    }
}
