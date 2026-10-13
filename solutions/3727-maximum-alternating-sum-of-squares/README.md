# LeetCode #3727 - Maximum Alternating Sum of Squares

- **Difficulty:** Medium
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Oct 13, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/maximum-alternating-sum-of-squares/)
- **Topics:** `Array` `Greedy` `Sorting`

## Problem Statement

You are given an integer array `nums`. You may **rearrange the elements** in any order.

The **alternating score** of an array `arr` is defined as:

	- `score = arr[0]^2 - arr[1]^2 + arr[2]^2 - arr[3]^2 + ...`

Return an integer denoting the **maximum possible alternating score** of `nums` after rearranging its elements.

 

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** 12

**Explanation:**

A possible rearrangement for `nums` is `[2,1,3]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

`score = 2^2 - 1^2 + 3^2 = 4 - 1 + 9 = 12`

**Example 2:**

**Input:** nums = [1,-1,2,-2,3,-3]

**Output:** 16

**Explanation:**

A possible rearrangement for `nums` is `[-3,-1,-2,1,3,2]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

`score = (-3)^2 - (-1)^2 + (-2)^2 - (1)^2 + (3)^2 - (2)^2 = 9 - 1 + 4 - 1 + 9 - 4 = 16`

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long d=0;
        long s=0;
        int n=nums.length;
        for(int i=0;i<(n)/2;i++){
            d+=(nums[i]);

        }
        for(int j=((n)/2);j<n;j++){
            s+=(nums[j]);
        }
        return (s-d);
        
    }
}
```
