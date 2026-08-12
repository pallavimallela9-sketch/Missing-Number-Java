# Missing Number - Java

## Problem Statement

Given an array containing `n` distinct numbers taken from
the range `0` to `n`, find the missing number.

## Example

Input:

[3, 0, 1]

Output:

2

## Explanation

The numbers from 0 to 3 are:

0, 1, 2, 3

The array contains:

0, 1, 3

Therefore, 2 is missing.

## Approach

Calculate the sum of all numbers from 0 to n.

Then subtract every number present in the array.

The remaining value is the missing number.

Formula:

n * (n + 1) / 2

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Language

Java

## Algorithm

Array / Mathematical Approach

## Author

M. Pallavi
