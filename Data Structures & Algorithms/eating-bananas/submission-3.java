class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int max=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]>max)
            max=piles[i];
        }

        int left=1;
        int right=max;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(feasible(piles,mid,h)==1)
            right=mid-1;
            else if(feasible(piles,mid,h)==0)
            left=mid+1;
        }
        return left;
    }
    int feasible(int piles[],int k,int h)
    {
        int sum=0;
        for(int i=0;i<piles.length;i++)
        {
            sum += (piles[i] + k - 1) / k;
        }
        if(sum<=h)
        return 1;
        else
        return 0;
    }
}
