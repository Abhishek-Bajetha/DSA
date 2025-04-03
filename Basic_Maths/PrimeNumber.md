# Check Prime Number

## Problem Statement

Given a positive integer `n`, determine whether it is a prime number. A prime number is a natural number greater than 1 that has exactly two divisors: 1 and itself.

## Examples

### Example 1:

**Input:**
```
n = 7
```
**Output:**
```
Prime
```
**Explanation:**
7 has only two divisors: 1 and 7. Hence, it is a prime number.

### Example 2:

**Input:**
```
n = 10
```
**Output:**
```
Not Prime
```
**Explanation:**
10 has divisors 1, 2, 5, and 10. Since it has more than two divisors, it is not a prime number.

### Example 3:

**Input:**
```
n = 1
```
**Output:**
```
Not Prime
```
**Explanation:**
1 is not considered a prime number as it has only one divisor (itself).

## Constraints
- `1 <= n <= 10^9`

## Expected Time Complexity
- `O(√n)`, iterating up to the square root of `n` to check divisibility efficiently.

## Expected Space Complexity
- `O(1)`, as no extra space is used apart from variables.

