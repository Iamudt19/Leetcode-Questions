# LeetCode #167 - Two Sum II - Input Array Is Sorted

- **Difficulty:** Medium
- **Language:** Java
- **Runtime:** 2 ms
- **Memory:** 48 MB
- **Date:** Sep 14, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
- **Topics:** `Array` `Two Pointers` `Binary Search`

## Problem Statement

Given a **1-indexed** array of integers `numbers` that is already ***sorted in non-decreasing order***, find two numbers such that they add up to a specific `target` number. Let these two numbers be `numbers[index_1]` and `numbers[index_2]` where `1 
	- `2

## Solution

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return new int[]{};
    }
}
```
