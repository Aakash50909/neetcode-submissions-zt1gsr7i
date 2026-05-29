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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(root==null)
        return false;
        if(subRoot==null)
        return true;
        if (isSameTree(root, subRoot))
        return true;
        else
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    boolean isSameTree(TreeNode node,TreeNode node2)
    {
        if(node==null && node2==null)
        return true;
        if(node!=null && node2!=null && node.val==node2.val)
        {
            return isSameTree(node.left,node2.left) && isSameTree(node.right,node2.right);
        }
        else
        return false;
    }
}
