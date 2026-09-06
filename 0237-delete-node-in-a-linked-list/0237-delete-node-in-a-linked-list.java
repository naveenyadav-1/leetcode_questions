/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
              node.val = node.next.val;
        node.next = node.next.next;
         
        // if(head== null)return null;
        // if(head.data==node){
        //     Node temp=head;
        //     head=head.next;
        //     return head;
        // }
        // Node temp=head;
        // Node prev=null;
        // while(temp!=null){
        //     if(temp.data=node){
        //         prev.next=prev.next.next;
        //     }
        //     break;
        //     prev=temp;
        //     temp=temp.next;
        // }
        // return head;
         

    }
}