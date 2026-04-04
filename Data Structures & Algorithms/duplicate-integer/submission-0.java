class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap <Integer, Integer> map = new HashMap<>();
        int c=0;
        for(int i : nums)
        {
            if(map.containsKey(i)==false)
            c=0;
            map.put(i,0);
            map.put(i,++c);
        }
        for(int j:nums)
        {
            if(map.get(j)>1)
            return true;
        }
        return false;
    }
}