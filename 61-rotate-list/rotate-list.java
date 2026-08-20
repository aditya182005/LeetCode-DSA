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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        int length=1;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        k=k%length;
        if(k==0) return head;
        temp.next=head;
        int Head=length-k;
        ListNode newTail=head;
        for(int i=1;i<Head;i++)
        {
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
}