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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null)
        return head;
        ListNode curr=head;
        ListNode prev=null;
        ListNode end=head;
        while(n>0)
        {
            end=end.next;
            n--;
        }
        while(end!=null)
        {
            end=end.next;
            prev=curr;
            curr=curr.next;
        }
        if(curr==null || prev==null)
        return head.next;
        else if(curr.next==null)
        prev.next=null;
        else
        {
            curr=curr.next;
            prev.next=curr;
        }
        return head;
    }
}
