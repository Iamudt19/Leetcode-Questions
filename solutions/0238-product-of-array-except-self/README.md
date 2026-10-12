# LeetCode #238 - Product of Array Except Self

- **Difficulty:** Medium
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Oct 12, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/product-of-array-except-self/)
- **Topics:** `Array` `Prefix Sum`

## Problem Statement

Given an integer array `nums`, return *an array* `answer` *such that* `answer[i]` *is equal to the product of all the elements of* `nums` *except* `nums[i]`.

The product of any prefix or suffix of `nums` is **guaranteed** to fit in a **32-bit** integer.

You must write an algorithm that runs in `O(n)` time and without using the division operation.

 

**Example 1:**

```text
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

**Example 2:**

```text
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

 

**Constraints:**

	- `2 

 

**Follow up:** Can you solve the problem in `O(1)` extra space complexity? (The output array **does not** count as extra space for space complexity analysis.)

## Solution

```plaintext
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int p=1;
            int j=0;
            int k=i+1;
            while(j<i){
                p*=nums[j];
                j++;
            }
            while(k<n){
                p*=nums[k];
                k++;
            }
            arr[i]=p;
            
        }
        return arr;
    }
}
```
