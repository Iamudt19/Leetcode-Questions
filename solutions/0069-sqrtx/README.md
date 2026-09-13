# LeetCode #69 - Sqrt(x)

- **Difficulty:** Easy
- **Language:** Java
- **Runtime:** 1 ms
- **Memory:** 42.6 MB
- **Date:** Sep 14, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/sqrtx/)
- **Topics:** `Math` `Binary Search` `Newton's Method`

## Problem Statement

Given a non-negative integer `x`, return *the square root of *`x`* rounded down to the nearest integer*. The returned integer should be **non-negative** as well.

You **must not use** any built-in exponent function or operator.

	- For example, do not use `pow(x, 0.5)` in c++ or `x ** 0.5` in python.

 

**Example 1:**

```text
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
```

**Example 2:**

```text
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
```

 

**Constraints:**

	- `0

## Solution

```java
class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        int ans=-1;
        if(x==0){
            return 0;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==x/mid){
            return mid;
            }
            else if(mid > x/mid){
                e=mid-1;
            }
            else{
                ans=mid;
                s=mid+1;
            }
            
        }
        return ans;
    }
}
```
