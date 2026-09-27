# LeetCode #1523 - Count Odd Numbers in an Interval Range

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 28, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)
- **Topics:** `Math`

## Problem Statement

Given two non-negative integers `low` and `high`. Return the *count of odd numbers between *`low`* and *`high`* (inclusive)*.


 

**Example 1:**


```text
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
```




**Example 2:**


```text
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
```




 

**Constraints:**


	- `0

## Solution

```plaintext
class Solution {
    public int countOdds(int low, int high) {
        return (high-low-1);
        
    }
}
```
