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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode temp1=head;
        int s=1;
        while(temp.next!=null){
            temp=temp.next;
            s++;
        }
        if(n==s){
            return head.next;
        }

        for(int i=0;i<s-n-1;i++){
            temp1=temp1.next;
        }
        
        
        temp1.next = temp1.next.next;
        
        return head;
    }
}