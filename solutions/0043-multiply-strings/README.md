# LeetCode #43 - Multiply Strings

- **Difficulty:** Medium
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 27, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/multiply-strings/)
- **Topics:** `Math` `String` `Simulation`

## Problem Statement

Given two non-negative integers `num1` and `num2` represented as strings, return the product of `num1` and `num2`, also represented as a string.

**Note:** You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

**Example 1:**

```text
Input: num1 = "2", num2 = "3"
Output: "6"
```

**Example 2:**

```text
Input: num1 = "123", num2 = "456"
Output: "56088"
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public String multiply(String num1, String num2) {
        int num=0;
        int num3=0;
        int n1=num1.length();
        int n2=num2.length();
        for(int i=0;i<n1;i++){
        
            int d=(num1.charAt(i))-'0';
            num=num*10+d;
            
        }
        for(int j=0;j<n2;j++){    
        
            int d=(num2.charAt(j))-'0';
            num3=num3*10+d;
              
        }
        return String.valueOf(num*num3);     
    }
}
```
