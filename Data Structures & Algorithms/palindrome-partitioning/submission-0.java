class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> result=new ArrayList<>();
        List<String> list =new ArrayList<>();
        return solve(result,list,s,0);
    }
    List<List<String>> solve(List<List<String>> result, List<String> list, String s, int start)
    {
        if(start==s.length())
        {
            result.add(new ArrayList<>(list));
            return result;
        }
        for(int i=start;i<s.length();i++)
        {
            if(palindrome(s.substring(start,i+1)))
            {
                list.add(s.substring(start,i+1));
                solve(result,list,s,i+1);
                list.removeLast();
            }
        }
        return result;
    }
    boolean palindrome(String str)
    {
        boolean flag=true;
        for(int i=0,j=str.length()-1;i<=j;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                flag=false;
            }
        }
        return flag;
    }
}
