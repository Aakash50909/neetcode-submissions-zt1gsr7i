class MinStack 
{
    List<Integer> min;
    List<Integer> stack;

    public MinStack() 
    {
        min= new ArrayList<>();
        stack=new ArrayList<>();
    }
    
    public void push(int val) 
    {
        if(min.isEmpty())
        min.add(val);
        else
        {
            min.add(Math.min(min.get(min.size()-1),val));
        }
        stack.add(val);
        
    }
    
    public void pop() 
    {
        min.remove(min.size()-1);
        stack.remove(stack.size()-1); 

         
    }
    
    public int top() 
    {
        return stack.get(stack.size()-1);
        
    }
    
    public int getMin() 
    {
        return min.get(stack.size()-1);
        
    }
}
