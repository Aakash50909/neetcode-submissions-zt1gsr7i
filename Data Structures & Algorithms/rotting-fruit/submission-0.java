class Solution {
    public int orangesRotting(int[][] grid) 
    {
        if(grid==null || grid.length==0)
        return -1;
        int[][] time = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            Arrays.fill(time[i],Integer.MAX_VALUE);
        }
        int days=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                   flood(grid,time,i,j,0);
                }
            }
        }
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    if(time[i][j]==Integer.MAX_VALUE)
                    return -1;
                    max=Math.max(max,time[i][j]);
                }
            }
        }
        return max;
        
    }
    void flood(int[][] grid, int [][] time, int i, int j, int currentTime)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0|| currentTime>=time[i][j])
        return;
        time[i][j]=currentTime;
        flood(grid,time,i-1,j,currentTime+1);
        flood(grid,time,i+1,j,currentTime+1);
        flood(grid,time,i,j+1,currentTime+1);
        flood(grid,time,i,j-1,currentTime+1);
    }
}
