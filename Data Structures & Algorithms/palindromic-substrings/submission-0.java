class Solution {
    public int countSubstrings(String s) 
    {
        int count=s.length();
        for(int idx=0;idx<s.length();idx++)
        {
            int left=idx-1;
            int right=idx+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                count++;
                left--;
                right++;
            }

            left=idx;
            right=idx+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                count++;
                left--;
                right++;
            }
        }
        return count;
        
    }
}
