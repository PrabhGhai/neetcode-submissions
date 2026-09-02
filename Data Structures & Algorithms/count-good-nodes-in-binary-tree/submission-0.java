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
    public int cal(TreeNode root, List<Integer>ls)
    {
        if(root == null) return 0;
        
        int left = 0;
        ls.add(root.val);
        left = cal(root.left,ls);
        int right = 0;
        right = cal(root.right,ls);

        boolean isElementGreater = false;
        for(int i=0;i<ls.size();i++)
        {
            if(ls.get(i)>root.val)
            {
                isElementGreater = true;
                break;
            }
        }

        ls.remove(ls.size()-1);

        if(isElementGreater == true) return left+right;

        return 1+left+right;
        



        
        


    }
    public int goodNodes(TreeNode root) {
        return cal(root,new ArrayList<>());
    }
}
