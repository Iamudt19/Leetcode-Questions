# LeetCode #1550 - Three Consecutive Odds

- **Difficulty:** Easy
- **Language:** Java
- **Runtime:** 0 ms
- **Memory:** 42.1 MB
- **Date:** Sep 13, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/three-consecutive-odds/)
- **Topics:** `Array`

## Problem Statement

Given an integer array `arr`, return `true` if there are three consecutive odd numbers in the array. Otherwise, return `false`.

 

**Example 1:**

```text
Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
```

**Example 2:**

```text
Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.
```

 

**Constraints:**

	- `1

## Solution

```java
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                c--;
            }
            else{
                c=3;
            }
            if(c==0){
                return true;
            }

        }
        return false;
    }
}

```
