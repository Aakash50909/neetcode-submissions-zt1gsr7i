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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head==null)
        return head;
        if(!hasKNodes(head,k))
        return head;

        ListNode curr= head;
        ListNode prev= null;
        int i=0;
        while(i<k)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            i++;
        }
        head.next=reverseKGroup(curr,k);
        return prev;
    }
    public boolean hasKNodes(ListNode node, int k)
    {
        int j=0;
        while(j<k && node!=null)
        {
            node=node.next;
            j++;
        }
        if(j==k)
        return true;
        else
        return false;
    }
}
