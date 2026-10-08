# LeetCode #19 - Remove Nth Node From End of List

- **Difficulty:** Medium
- **Language:** Java
- **Runtime:** 0 ms
- **Memory:** 43.5 MB
- **Date:** Oct 9, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
- **Topics:** `Linked List` `Two Pointers`

## Problem Statement

Given the `head` of a linked list, remove the `n^th` node from the end of the list and return its head.

 

**Example 1:**

```text
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
```

**Example 2:**

```text
Input: head = [1], n = 1
Output: []
```

**Example 3:**

```text
Input: head = [1,2], n = 1
Output: [1]
```

 

**Constraints:**

	- The number of nodes in the list is `sz`.

	- `1 

 

**Follow up:** Could you do this in one pass?

## Solution

```java
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
```
