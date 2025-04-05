# Print all Divisors

## Problem Statement

Given a positive integer `n`, print all its divisors in ascending order. A divisor of `n` is any integer that divides `n` without leaving a remainder.

## Examples

### Example 1:

**Input:**
```
n = 36
```
**Output:**
```
1 2 3 4 6 9 12 18 36
```
**Explanation:**
All numbers in the output divide 36 without leaving a remainder.

### Example 2:

**Input:**
```
n = 15
```
**Output:**
```
1 3 5 15
```
**Explanation:**
These numbers divide 15 exactly.

### Example 3:

**Input:**
```
n = 1
```
**Output:**
```
1
```
**Explanation:**
1 has only one divisor, which is itself.

## Constraints
- `1 <= n <= 10^9`

## Expected Time Complexity
- `O(√n)`, since only divisors up to the square root of `n` need to be checked.

## Expected Space Complexity
- `O(k)`, where `k` is the number of divisors of `n`.

