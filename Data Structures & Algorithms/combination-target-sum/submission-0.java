class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) 
    {
        List<List<Integer>> res=new ArrayList<>();
        List <Integer> com=new ArrayList<>();
        int sum=0;
        return combination(res,com,target, nums,sum,0);
    }
    List<List<Integer>> combination(List<List<Integer>> result, List<Integer> comb, int t, int[] arr,int s, int index)
    {
        if(s==t)
        {
            result.add(new ArrayList<>(comb));
            return result;
        }
        for(int i=index;i<arr.length;i++)
        {
            s=s+arr[i];
            comb.add(arr[i]);
            if(s>t)
            {
                s=s-arr[i];
                comb.removeLast();
                continue;
            }
            combination(result,comb,t,arr,s,index);
            s=s-arr[i];
            comb.removeLast();
            index++;
        }
        return result;
    }
}
