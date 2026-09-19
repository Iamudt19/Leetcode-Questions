# LeetCode #540 - Single Element in a Sorted Array

- **Difficulty:** Medium
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 19, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/single-element-in-a-sorted-array/)
- **Topics:** `Array` `Binary Search`

## Problem Statement

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return *the single element that appears only once*.

Your solution must run in `O(log n)` time and `O(1)` space.

 

**Example 1:**

```text
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
```

**Example 2:**

```text
Input: nums = [3,3,7,7,10,11,11]
Output: 10
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c=2;
        int ans=0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                c--;
                if(c==0){
                    ans=nums[i-1];
                    return ans;
                }
            }
            else{
                c=2;
            }
           
        }
        return 0;
    }
}
```
