class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        Arrays.sort(nums);
        return subsets(result, subset, nums,0);
    }
    List<List<Integer>> subsets(List<List<Integer>> res,List<Integer> subset, int[] nums, int idx)
    {
        res.add(new ArrayList<>(subset));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx)
            {
                if(nums[i-1]==nums[i])
                continue;
            }
            subset.add(nums[i]);
            subsets(res,subset,nums,i+1);
            subset.removeLast();
        }
        return res;
    }
}
