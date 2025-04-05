# Print N Times (Same Value)

## Problem Statement

Write a recursive function that prints a given value or word exactly `N` times.

## Description

You are given an integer `N` and a string `value`. The task is to print `value`, `N` times using recursion. Each instance should be printed on a new line. Do **not** use loops. The goal is to practice recursion fundamentals.

## Example

### Example 1:
**Input:**
```
N = 3, value = "Hello"
```
**Output:**
```
Hello
Hello
Hello
```

### Example 2:
**Input:**
```
N = 1, value = "Abhishek"
```
**Output:**
```
Abhishek
```

## Constraints
- `1 <= N <= 1000`
- `value` can be any printable string of length up to 100 characters.

## Expected Time Complexity
- `O(N)`

## Expected Space Complexity
- `O(N)` due to recursive stack calls

