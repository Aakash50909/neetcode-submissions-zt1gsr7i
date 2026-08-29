class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> com=new ArrayList<>();
        int sum=0;
        Arrays.sort(candidates);
        return combination(result,com,candidates,target,0,sum);
    }
    List<List<Integer>> combination(List<List<Integer>> res, List<Integer> com, int[] arr, int target, int index,int sum)
    {
        if(sum==target)
        {
            res.add(new ArrayList<>(com));
            return res;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(i>index)
            {
                if(arr[i-1]==arr[i])
                continue;
            }
            if(sum+arr[i]<=target)
            {
            sum+=arr[i];
            com.add(arr[i]);
            combination(res,com,arr,target,i+1,sum);
            sum-=arr[i];
            com.removeLast();
            }
        }
        return res;
    }
}
