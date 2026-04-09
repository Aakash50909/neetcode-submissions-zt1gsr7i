class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        int l=0;
        int r=0;
        int max=Integer.MIN_VALUE;
        int result[]=new int[nums.length-k+1];
        for(r=0;r<nums.length;r++)
        {
            max=Math.max(max,nums[r]);
            if(r-l+1==k)
            {
                result[l]=max;
                if(max==nums[l])
                {
                    int x=l;
                    max=Integer.MIN_VALUE;
                    while(x<r)
                    {
                        x++;
                        max=Math.max(max,nums[x]);
                    }
                }
                l++;
            }
        }
        return result;
    }
}
