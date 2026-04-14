class Node
{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int k,int v)
    {
        key=k;
        val=v;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache 
{
    int cap=0;
    HashMap <Integer,Node> map;
    Node head,tail;
    Node lru= new Node(0,0);
    public LRUCache(int capacity) 
    {
        map=new HashMap<>();
        cap=capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    public void remove(Node node)
    {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void insertAtTail(Node node)
    {
        Node prev = tail.prev;
        prev.next = node;
        node.prev = prev;
        node.next =tail;
        tail.prev =node;
    }
    public int get(int key) 
    {
        if(map.containsKey(key))
        {
            lru= map.get(key);
            remove(lru);
            insertAtTail(lru);
            return lru.val;
        }
        else
        return -1;

    }
    public void put(int key, int value) 
    {
        if(map.containsKey(key))
        {    Node node = map.get(key);
            node.val = value;
            remove(node);
            insertAtTail(node);
        }
        else
        {
            if(map.size()==cap)
            {
            map.remove(head.next.key);
            remove(head.next);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            insertAtTail(node);
        }
        
    }
}
