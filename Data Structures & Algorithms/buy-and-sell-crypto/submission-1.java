class Solution {
    public int maxProfit(int[] prices) 
    {
        int min=prices[0];
        int profit=0;
        int maxpro=-1;
        for(int i=1;i<prices.length;i++)
        {
            profit=prices[i]-min;
            if(maxpro<profit)
            maxpro=profit;
            if(prices[i]<min)
            min=prices[i];
        }
        if(maxpro<0)
        return 0;
        else
        return maxpro;
        
    }
}
