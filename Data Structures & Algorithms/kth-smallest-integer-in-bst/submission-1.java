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
    int val=0;
    int kk=0;
    public int kthSmallest(TreeNode root, int k) 
    {
        //inorder
        kk=k;
        inorder(root);
        return val;
    }
    void inorder(TreeNode curr)
    {
        if (curr==null)
        return;
        inorder(curr.left);
        kk--;
        if(kk==0)
        {
            val=curr.val;
            return;
        }
        inorder(curr.right);
    }
}
