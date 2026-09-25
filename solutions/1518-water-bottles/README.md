# LeetCode #1518 - Water Bottles

- **Difficulty:** Easy
- **Language:** Text
- **Runtime:** N/A
- **Memory:** N/A
- **Date:** Sep 26, 2026
- **Problem Link:** [LeetCode](https://leetcode.com/problems/water-bottles/)
- **Topics:** `Math` `Simulation`

## Problem Statement

There are `numBottles` water bottles that are initially full of water. You can exchange `numExchange` empty water bottles from the market with one full water bottle.

The operation of drinking a full water bottle turns it into an empty bottle.

Given the two integers `numBottles` and `numExchange`, return *the **maximum** number of water bottles you can drink*.

 

**Example 1:**

```text
Input: numBottles = 9, numExchange = 3
Output: 13
Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
Number of water bottles you can drink: 9 + 3 + 1 = 13.
```

**Example 2:**

```text
Input: numBottles = 15, numExchange = 4
Output: 19
Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
Number of water bottles you can drink: 15 + 3 + 1 = 19.
```

 

**Constraints:**

	- `1

## Solution

```plaintext
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        int n=numBottles;
        if(n%numExchange!=0){
            ans=1;
        }
        while(n>0){
            ans+=n;
            n/=numExchange;
            

        }
        return ans;
    }
}
```
