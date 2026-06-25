class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> subset= new ArrayList<>();
        dfs(0, res, subset, nums);
        return res;
    }
    void dfs(int i,List<List<Integer>> res,List<Integer> subset, int[] n)
        {
            List<Integer> copy = new ArrayList<>(subset);

            if(i>=n.length)
            {
                res.add(copy);
                return;
            }
            subset.add(n[i]);
            dfs(i+1, res, subset, n);
            subset.removeLast();
            dfs(i+1, res, subset, n);
        }
}
