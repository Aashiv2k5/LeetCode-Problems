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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode ans = new ListNode();
        while(l1!=null && l2!=null){
          if(l1.val<l2.val){
            insertlast(ans,l1.val);
            l1=l1.next;
          }
          else{
            insertlast(ans,l2.val);
            l2=l2.next;
          }
        }
        while(l2!=null){
            insertlast(ans,l2.val);
            l2=l2.next;
        }
        
 
        while(l1!=null){
            insertlast(ans,l1.val);
            l1=l1.next;
        }
        
        return ans.next;
        
    }
    public void insertlast(ListNode l1 , int val){
        ListNode ll = new ListNode(val);
        ListNode curr = l1;
        if(l1 ==null){
           l1=ll;
        }
     
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=ll;
        return;
    }
}