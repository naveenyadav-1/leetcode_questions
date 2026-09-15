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
    public ListNode reverseLinkedList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr != null){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
        

    }
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
        ListNode secondHalf= reverseLinkedList(slow.next);
        ListNode first=head;
        ListNode second=secondHalf;
        while(second !=null){
            if(first.val!=second.val){
                reverseLinkedList(slow.next);
                return false;
            }
            first=first.next;
            second=second.next;
            // reverseLinkedList(slow.next);
            // return true;
        }
        reverseLinkedList(slow.next);
            return true;
    }
}