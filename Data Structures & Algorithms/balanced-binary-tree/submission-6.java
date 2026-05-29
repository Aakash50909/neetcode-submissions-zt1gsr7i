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
    boolean flag=true;
    public boolean isBalanced(TreeNode root) 
    {
        depth(root);
        return flag;
    }
    public int depth(TreeNode node)
    {
        if(node==null)
        return 0;
        int c1=depth(node.left);
        int c2=depth(node.right);
        int diff=c1-c2;
        if(diff==-1 || diff==0 || diff==1);
        
        else
        {
            flag=false; 
            return 1+Math.max(c1,c2);
        }
        return 1+Math.max(c1,c2);
           
    }
}
