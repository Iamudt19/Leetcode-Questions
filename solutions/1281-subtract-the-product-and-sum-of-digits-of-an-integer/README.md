# LeetCode #1281 - Subtract the Product and Sum of Digits of an Integer

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 24, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
- **Topics:** `Math`

## Problem Statement

Given an integer number `n`, return the difference between the product of its digits and the sum of its digits.

 

**Example 1:**

```text
Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
```

**Example 2:**

```text
Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            p*=d;
            n/=10;
        }
        return p-sum;
    }
}
```
