# LeetCode #896 - Monotonic Array

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 21, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/monotonic-array/)
- **Topics:** `Array`

## Problem Statement

An array is **monotonic** if it is either monotone increasing or monotone decreasing.

An array `nums` is monotone increasing if for all `i = nums[j]`.

Given an integer array `nums`, return `true`* if the given array is monotonic, or *`false`* otherwise*.

 

**Example 1:**

```text
Input: nums = [1,2,2,3]
Output: true
```

**Example 2:**

```text
Input: nums = [6,5,4,4]
Output: true
```

**Example 3:**

```text
Input: nums = [1,3,2]
Output: false
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
        
        if(nums[1]>nums[0]){
            for(int i=1;i<nums.length;i++){
                if(i-1<i && nums[i-1]>nums[i]){
                    return false;
                }
            }
        }
        else{
            for(int i=1;i<nums.length;i++){
                if(i-1>i && nums[i-1]<nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
```
