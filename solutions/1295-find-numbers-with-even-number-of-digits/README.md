# LeetCode #1295 - Find Numbers with Even Number of Digits

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 21, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
- **Topics:** `Array` `Math`

## Problem Statement

Given an array `nums` of integers, return how many of them contain an **even number** of digits.

 

**Example 1:**

```text
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
```

**Example 2:**

```text
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int dc=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                dc++;
               }
            if(dc%2==0){
                c++;
            }
            dc=0;
        }
        return c;
    }
}
```
