class Solution {
    public List<String> letterCombinations(String digits) 
    {
        HashMap <Character, String> map= new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List <String> result= new ArrayList<>();
        return combination(result,map,digits,0,"");
    }
    List<String> combination(List<String> result,HashMap <Character, String> map,String digits,int idx, String st)
    {
        if(idx==digits.length())
        {
            return result;
        }
        String str=map.get(digits.charAt(idx));
        for(int i=0;i<str.length();i++)
        {
            st=st+str.charAt(i);
            if(st.length()==digits.length())
            {
                result.add(new String(st));
            }
            combination(result,map,digits,idx+1,st);
            st=st.substring(0,st.length()-1);
        }
        return result;
    }
}
