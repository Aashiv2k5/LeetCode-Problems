/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        int length = findlength(head);
        if(length==0) return null;
        for(int i=0;i<length;i++){
            slow=slow.next;
        }
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
        
    }
    public int findlength(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp = fast;
                int length =0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
                
            }
        }return 0;
    }
}