# LeetCode #1470 - Shuffle the Array

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Oct 25, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/shuffle-the-array/)
- **Topics:** `Array`

## Problem Statement

Given the array `nums` consisting of `2n` elements in the form `[x_1,x_2,...,x_n,y_1,y_2,...,y_n]`.


*Return the array in the form* `[x_1,y_1,x_2,y_2,...,x_n,y_n]`.


 

**Example 1:**


```text
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
```




**Example 2:**


```text
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
```




**Example 3:**


```text
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
```




 

**Constraints:**


	- `1

## Solution

```plaintext
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans =new int[2*n];
        int i=0;
        int j=n;
        int z=0;
        while(z<2*n){
            if(z%2==0){
                ans[z]=nums[i];
                i++;
            }
            else{
                ans[z]=nums[j];
                j++;
            }
            z++;
        }

        return ans;
    }
}
```
