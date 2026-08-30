class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> result= new ArrayList<>();
        String str="";
        return paranthesis(result,str,n,0,0);
    }
    List<String> paranthesis(List<String> result,String str,int n,int open, int close)
    {
        if(str.length()==n*2)
        {
            result.add(new String(str));
            return result;
        }
        if(open<n)
        {
            str=str.concat("(");
            paranthesis(result,str,n,open+1,close);
            str = str.substring(0, str.length() - 1);
        }
        if(close<open)
        {
            str=str.concat(")");
            paranthesis(result,str,n,open,close+1);
            str = str.substring(0, str.length() - 1);
        }
        return result;
    }
}
