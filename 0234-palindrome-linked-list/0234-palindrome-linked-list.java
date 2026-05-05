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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast = fast.next.next;

        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode pre = null;
        ListNode curr = slow;
        ListNode next = slow.next;
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        ListNode i =head;
        ListNode j = pre;
        while(j!=null){
           if(j.val!=i.val){
            return false;
           }
           else{
            i=i.next;
            j=j.next;
           }
        }return true;

        
    }
}