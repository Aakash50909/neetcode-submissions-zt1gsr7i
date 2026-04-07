class TimeMap {
    
    HashMap <String,List<List<String>>> map;  

    public TimeMap() 
    {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        List<List<String>> outer =map.getOrDefault(key,new ArrayList<>());
        List<String> list= new ArrayList<>();
        list.add(value);
        list.add(Integer.toString(timestamp));
        outer.add(list);
        map.put(key,outer);
    }
    
    public String get(String key, int timestamp) 
    {
        List<List<String>> outer=map.get(key);
        if(outer==null)
        return "";
        int left=0;
        int right=outer.size()-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(Integer.parseInt(outer.get(mid).get(1))<=timestamp)
            left=mid+1;
            else
            right=mid-1;
        }
        if(left-1<0)
        return "";
        else
        return outer.get(left-1).get(0);
    }
}
