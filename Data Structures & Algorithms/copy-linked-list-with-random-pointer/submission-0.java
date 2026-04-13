/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) 
    {
        Node curr=head;
        HashMap <Node,Node> map= new HashMap<>();
        while(curr!=null)
        {
            map.put(curr,new Node(curr.val));
            curr=curr.next;
        }
        curr=head;
        Node copy=map.get(head);
        Node rtrn=map.get(head);
        while(curr!=null)
        {
            copy.next=map.get(curr.next);
            copy.random=map.get(curr.random);
            curr=curr.next;
            copy=copy.next;
        }
        return rtrn;
    }
}
