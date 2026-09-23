# LeetCode #493 - Reverse Pairs

- **Difficulty:** Hard
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 23, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/reverse-pairs/)
- **Topics:** `Array` `Binary Search` `Divide and Conquer` `Binary Indexed Tree` `Segment Tree` `Merge Sort` `Ordered Set` `Treap`

## Problem Statement

Given an integer array `nums`, return *the number of **reverse pairs** in the array*.

A **reverse pair** is a pair `(i, j)` where:

	- `0  2 * nums[j]`.

 

**Example 1:**

```text
Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
```

**Example 2:**

```text
Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public int reversePairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i<j){
                    if(nums[i]>2*nums[j]){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
```
