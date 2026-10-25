# LeetCode #1920 - Build Array from Permutation

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Oct 25, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/build-array-from-permutation/)
- **Topics:** `Array` `Simulation`

## Problem Statement

Given a **zero-based permutation** `nums` (**0-indexed**), build an array `ans` of the **same length** where `ans[i] = nums[nums[i]]` for each `0 
	- `1 

 

**Follow-up:** Can you solve it without using an extra space (i.e., `O(1)` memory)?

## Solution

```plaintext
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
```
