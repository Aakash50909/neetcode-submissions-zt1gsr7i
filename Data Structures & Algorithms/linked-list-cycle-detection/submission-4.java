/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution 
{
    public boolean hasCycle(ListNode head) 
    {
        if(head==null)
        return false;
        if(head.next==head)
        return true;
        else if(head.next==null)
        return false;

        ListNode curr=head;
        ListNode run=head;
        if(head==null)
        return false;
        while(curr!=null && run.next!=null && run.next.next!=null)
        {
            run=run.next.next;
            curr=curr.next;
            if(curr==run)
            return true;
        }
        return false;
    }
}