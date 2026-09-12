# LeetCode #69 - Sqrt(x)

- **Difficulty:** Easy
- **Language:** Java
- **Runtime:** 1 ms
- **Memory:** 42.7 MB
- **Date:** Sep 12, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/sqrtx/)
- **Topics:** `Math` `Binary Search` `Newton's Method`

## Solution

```java
class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        int ans=-1;
        if(x==0){
            return 0;
        }

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==x/mid){
            return mid;
            }
            else if(mid > x/mid){
                e=mid-1;
            }

```
