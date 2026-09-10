class Solution {
    public String longestPalindrome(String s) 
    {
        String res="";
        int resLen=0;
        if(s.length()==1)
        {
            res=res+s.charAt(0);
            return res;
        }
        int idx=0;
        int left=idx;
        int right=idx;
        for(idx=0;idx<s.length();idx++)
        {
            left=idx;
            right=idx;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(right-left+1>resLen)
                {
                    res=s.substring(left,right+1);
                    resLen=right-left+1;
                }
                left--;
                right++;
            }
                 left=idx;
                 right=idx+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if(right-left+1>resLen)
                {
                    res=s.substring(left,right+1);
                    resLen=right-left+1;
                }
                left--;
                right++;
            }
        }
        return res;
    }

} 