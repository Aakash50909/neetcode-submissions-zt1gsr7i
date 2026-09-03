class Solution {
    public int rob(int[] nums) 
    {
        int[] dp= new int[nums.length];
        if(nums.length==1)
        {
            return nums[0];
        }
        if(nums.length==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(robber(nums,dp,1,nums.length-1),robber(nums,dp,0,nums.length-2));
        
    }
    int robber(int[] nums,int[] dp,int start,int end)
    {
        dp[start]=nums[start];
        dp[start+1]=Math.max(dp[start],nums[start+1]);
        int i=start+2;
        while(i<=end)
        {
                dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
            i++;
        }
        return Math.max(dp[end-1],dp[end]);
    }
}
