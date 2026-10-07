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
        ListNode prev = head;
        ListNode cur = prev.next;
        while(prev.next!=null){
        
        if(head==null){
            return head;
        }
        if(head.val==val){
            head=head.next;
        }
        
        
            if(cur.val==val){
                
                prev.next=cur.next;
                cur.next=null;
            }

        

        prev=prev.next;
        }
        return head;
    }
}