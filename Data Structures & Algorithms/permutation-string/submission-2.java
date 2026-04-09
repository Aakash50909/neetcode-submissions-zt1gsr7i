class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        int l=0;
        int r=0;
        HashMap <Character, Integer> map=new HashMap<>();
        HashMap <Character, Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(r=0;r<s2.length();r++)
        {
            char c=s2.charAt(r);
            map2.put(c,map2.getOrDefault(c,0)+1);
            if(r-l+1==s1.length())
            {
                if(map2.equals(map))
                return true;
            }
            else if(r-l+1>s1.length() && map2.containsKey(s2.charAt(l)))
            {
                if(map2.get(s2.charAt(l)) == 1)
                map2.remove(s2.charAt(l));
                else
                map2.put(s2.charAt(l), map2.get(s2.charAt(l))-1);
                if(map2.equals(map))
                return true;
                l++;
            }
        }
        return false;
    }
}
