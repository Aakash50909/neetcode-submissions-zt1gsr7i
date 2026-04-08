class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;
        int result=0;
        for (int r = 0; r < s.length(); r++) 
        {
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max= Math.max(max, map.get(ch));
            if(r-l+1 - max<=k)
                result++;
            else
            {
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
        }
        return result;
    }
}