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
    public void reorderList(ListNode head) 
    {
        int length=0;
        ListNode curr=head;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        curr=head;
        length=length;
        int hl=length/2;
        ListNode l1=head;
        ListNode l2=head;
        ListNode prev=head;
        int i=0;
        while(i<=hl)
        {
            i++;
            prev=l2;
            l2=l2.next;
        }

        prev.next=null;
        prev=null;
        while(l2!=null)
        {
            ListNode temp=l2.next;
            l2.next=prev;
            prev=l2;
            l2=temp;
        }
        l2=prev;
        while(l1!=null && l2!=null)
        {
            ListNode temp=l1.next;
            ListNode temp2=l2.next;
            l1.next=l2;
            l2.next=temp;
            l1=temp;
            l2=temp2;
        }
    }
}
