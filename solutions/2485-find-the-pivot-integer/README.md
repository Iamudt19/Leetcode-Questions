# LeetCode #2485 - Find the Pivot Integer

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 26, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/find-the-pivot-integer/)
- **Topics:** `Math` `Prefix Sum`

## Problem Statement

Given a positive integer `n`, find the **pivot integer** `x` such that:

	- The sum of all elements between `1` and `x` inclusively equals the sum of all elements between `x` and `n` inclusively.

Return *the pivot integer *`x`. If no such integer exists, return `-1`. It is guaranteed that there will be at most one pivot index for the given input.

 

**Example 1:**

```text
Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
```

**Example 2:**

```text
Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.
```

**Example 3:**

```text
Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            if(i*(i+1)==(n*(n+1)/2)+i){
                return i;
            }
        }

        return -1;
    }
}
```
