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

class Solution 
{
    int c=0;
    public int goodNodes(TreeNode root) 
    {
        //dfs
        if(root==null)
        return 0;
        int max=root.val;
        dfs(root,max);
        return c;
    }
    public void dfs(TreeNode curr,int max)
    {
        if(curr==null)
        return ;
            if(curr.val>=max)
            {
                c++;
                dfs(curr.left,curr.val);
                dfs(curr.right,curr.val);
            }
            else
            {
                dfs(curr.left,max);
                dfs(curr.right,max);
            }
    }
}
