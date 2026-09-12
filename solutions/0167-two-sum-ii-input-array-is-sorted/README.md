# LeetCode #167 - Two Sum II - Input Array Is Sorted

- **Difficulty:** Medium
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 12, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
- **Topics:** `Array` `Two Pointers` `Binary Search`

## Solution

```plaintext
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            }
            else if (sum < target) {
                i++;
            }
            else {

```
