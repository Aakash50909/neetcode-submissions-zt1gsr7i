class Solution {
    public boolean isValid(String s) 
    {
        Stack <Character> stack= new Stack<>();
        int top=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='(')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==']'||s.charAt(i)=='}'||s.charAt(i)==')')
            {
                if(stack.empty()) return false;
                char element= stack.peek();
                if((element=='[' && s.charAt(i)==']') || (element=='{' && s.charAt(i)=='}') || (element=='(' && s.charAt(i)==')'))
                stack.pop();
                else
                return false;
            }
            else
            {
                return false;
            }
        }
        if(!stack.empty())
        return false;
        else
        return true;
        
    }
}
