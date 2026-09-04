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
    public void solve(TreeNode root, int val)
    {
        
        if(root.left ==null && val<root.val){
            root.left = new TreeNode(val);
            return;
        }
        if(root.right ==null && val>root.val){
            root.right = new TreeNode(val);
            return;
        }

        if(val<root.val) solve(root.left,val);
        else solve(root.right,val);

        return;

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null ) return new TreeNode(val);
        TreeNode temp = root;
        solve(root,val);
        return temp;
    }
}