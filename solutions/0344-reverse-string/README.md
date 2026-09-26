# LeetCode #344 - Reverse String

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 26, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/reverse-string/)
- **Topics:** `Two Pointers` `String`

## Problem Statement

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

**Example 1:**

```text
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```

**Example 2:**

```text
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
```

 

**Constraints:**

	- `1 printable ascii character.

## Solution

```plaintext
class Solution {
    public void reverseString(char[] s) {

        char c;

        for (int i = 0; i < s.length / 2; i++) {

            c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }
    }
}
```
