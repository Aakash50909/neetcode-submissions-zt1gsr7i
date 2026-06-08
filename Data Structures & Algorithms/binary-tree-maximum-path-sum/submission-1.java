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
    int sum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) 
    {
        int val=maxsum(root);
        return sum;
    }
    int maxsum(TreeNode curr)
    {
        if(curr==null)
        return 0;
        int leftSum =Math.max(0, maxsum(curr.left));
        int rightSum=Math.max(0, maxsum(curr.right));
        sum =Math.max(sum, curr.val + leftSum + rightSum);
        return curr.val +Math.max(leftSum, rightSum);
    }
}
