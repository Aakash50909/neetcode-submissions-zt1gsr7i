class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet <Character> set= new HashSet<>();
        if(s.equals(""))
        return 0;
        else if(s.length()==1)
        return 1;
        int max=0;
        int r=1;
        int l=0;
        set.add(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            r++;
            char ch=s.charAt(i);
            while(set.contains(ch))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            if(max<(r-l+1))
            max=r-l;
        }
        return max;
    }
}
