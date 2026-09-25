class Solution {
    public boolean canPartition(int[] nums) 
    {
        int target=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            target+=nums[i];
        }
        if(target%2!=0)
        return false;   
        target=target/2;    
        boolean[] dp= new boolean[target+1];
        dp[0]=true;
        for(int i=0;i<n;i++)
        {
            for(int j=target;j>=nums[i];j--)
            {
                if(dp[j-nums[i]]==true)
                dp[j]=true;
            }
        }
        return dp[target];
    }
}
