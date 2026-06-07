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
    int n=0;
    HashMap <Integer,Integer> map= new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        
        n=preorder.length;
        for(int i=0;i<n;i++)
        map.put(inorder[i],i);
        TreeNode node = build(preorder,0,0,n-1);
        return node;
    }
    TreeNode build(int[] preorder, int preStart, int inStart, int inEnd)
    {
        if(inStart>inEnd)
        return null;
        int idx=map.get(preorder[preStart]);
        TreeNode root= new TreeNode(preorder[preStart]);
        root.left=build(preorder,preStart+1,inStart, idx-1);
        root.right=build(preorder,preStart + 1 + (idx - inStart),idx +1, inEnd);

        return root;
    }
}
