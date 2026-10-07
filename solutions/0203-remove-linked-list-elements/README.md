# LeetCode #203 - Remove Linked List Elements

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Oct 7, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)
- **Topics:** `Linked List` `Recursion`

## Problem Statement

Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list that has `Node.val == val`, and return *the new head*.

 

**Example 1:**

```text
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
```

**Example 2:**

```text
Input: head = [], val = 1
Output: []
```

**Example 3:**

```text
Input: head = [7,7,7,7], val = 7
Output: []
```

 

**Constraints:**

	- The number of nodes in the list is in the range `[0, 10^4]`.

	- `1

## Solution

```plaintext
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

        if (head == null) {
            return head;
        }

        
        while (head != null && head.val == val) {
            head = head.next;
            
        }
        if (head == null) {
            return head;
        }

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null) {

            if (cur.val == val) {
                prev.next=cur.next;
                cur=cur.next;
            } 
            else {
                prev=cur;
                cur=cur.next;
            }
        }

        return head;
    }
}
```
