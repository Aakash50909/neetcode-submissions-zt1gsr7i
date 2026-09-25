class Solution {
    public int maxProduct(int[] nums) 
    {
        int n=nums.length;
        int max=nums[0];
        if(nums.length==1)
        return nums[0];
        int p1=1;
        int p2=1;
        for(int i=0;i<n;i++)
        {   
            if(p1==0)
            p1=1;
            if(p2==0)
            p2=1;
            p1=p1*nums[i];
            p2=p2*nums[n-i-1];
            
            max=Math.max(max,Math.max(p1,p2));
        }
        return max;
    }
}
