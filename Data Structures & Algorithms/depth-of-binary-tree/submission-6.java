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
    public int maxDepth(TreeNode root) 
    {
        if(root==null)
        return 0;
        TreeNode curr=root;
        int c=1;
        int c2=1;
                c=maxDepth(curr.left);
                c2=maxDepth(curr.right);
        return 1+Math.max(c,c2);
        
    }
}
