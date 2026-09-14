# LeetCode #836 - Rectangle Overlap

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 14, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/rectangle-overlap/)
- **Topics:** `Math` `Geometry`

## Problem Statement

An axis-aligned rectangle is represented as a list `[x1, y1, x2, y2]`, where `(x1, y1)` is the coordinate of its bottom-left corner, and `(x2, y2)` is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.

Two rectangles overlap if the area of their intersection is **positive**. To be clear, two rectangles that only touch at the corner or edges do not overlap.

Given two axis-aligned rectangles `rec1` and `rec2`, return `true`* if they overlap, otherwise return *`false`.

 

**Example 1:**

```text
Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
Output: true
```

**Example 2:**

```text
Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
Output: false
```

**Example 3:**

```text
Input: rec1 = [0,0,1,1], rec2 = [2,2,3,3]
Output: false
```

 

**Constraints:**

	- `rec1.length == 4`

	- `rec2.length == 4`

	- `-10^9

## Solution

```plaintext
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec2[0]>=rec1[0] && rec2[0]<rec1[2]){
            if(rec2[1]>=rec1[1] && rec2[1]<rec2[3]){
                return true;
            }
        }
        return false;
    }
}
```
