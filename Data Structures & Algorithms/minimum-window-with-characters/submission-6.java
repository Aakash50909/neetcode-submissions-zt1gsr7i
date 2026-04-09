class Solution {
    public String minWindow(String s, String t) 
    {
        int count=0;
        int l=0;
        int r=0;    
        int min=Integer.MAX_VALUE;
        int start=0;
        HashMap <Character, Integer> map= new HashMap<>();
        HashMap <Character, Integer> map2= new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        for(r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            map2.put(c,map2.getOrDefault(c,0)+1);
            if(map.containsKey(c) && map2.get(c).equals(map.get(c)))
            count++;
                while(count==map.size())
                {
                    if (r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }
                    min=Math.min(min,r-l+1);
                    if(map.containsKey(s.charAt(l)) && map2.get(s.charAt(l)).equals(map.get(s.charAt(l))))
                    count--;
                    if(map2.get(s.charAt(l)) == 1)
                    map2.remove(s.charAt(l));
                    else
                    map2.put(s.charAt(l), map2.get(s.charAt(l))-1);
                    l++;
                }
            }
        if(min==Integer.MAX_VALUE)
        return "";
        else
        return s.substring(start,start+min);
    }
}
