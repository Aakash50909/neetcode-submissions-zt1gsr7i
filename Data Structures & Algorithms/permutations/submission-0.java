class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> per=new ArrayList<>();
        return permutation(result,per,nums,0);
    }
    List<List<Integer>> permutation(List<List<Integer>> res,List<Integer> per,int[] nums,int idx)
    {
        if(per.size()==nums.length)
        {
            res.add(new ArrayList<>(per));
            return res;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(per.contains(nums[i]))
                continue;
            per.add(nums[i]);
            permutation(res,per,nums,i+1);
            per.removeLast();
            idx--;
        }
        return res;
    }
}
