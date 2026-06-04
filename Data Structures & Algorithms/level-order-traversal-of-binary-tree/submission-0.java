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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        //bfs
        List <List<Integer>> result= new ArrayList<>();
        ArrayList <Integer> list= new ArrayList<>();
        Queue <TreeNode> queue=new LinkedList<>();
        if (root==null)
        return result;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int currentLevelSize=queue.size();
            while(currentLevelSize!=0)
            {
                TreeNode curr=queue.poll();
                list.add(curr.val);
                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                queue.add(curr.right);
                currentLevelSize--;
            }
            result.add(new ArrayList<>(list));
            list.clear();                                                                                                                                                                                                                                                                                                                   
        }
        return result;
    }
}
