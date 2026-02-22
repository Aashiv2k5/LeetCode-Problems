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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev=null;
        if(head==null){
            return head;
        }
        while(head!=null && head.val==val){
            if(head==null){
                return head;
            }
                head=head.next;
        }
        ListNode temp=head;
        while(temp!=null){
           
            if(temp.val==val ){
                if(temp.next==null){
                    prev.next=null;
                    return head;
                }
                prev.next=temp.next;
                temp=temp.next;
                continue;
            }
            prev=temp;
            temp=temp.next;
        }return head;
    }
}