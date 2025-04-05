# Find GCD (Greatest Common Divisor)

## Problem Statement

Given two positive integers `a` and `b`, find their Greatest Common Divisor (GCD), also known as the Highest Common Factor (HCF). The GCD of two integers is the largest positive integer that divides both numbers without leaving a remainder.

## Examples

### Example 1:

**Input:**
```
a = 12, b = 15
```
**Output:**
```
3
```
**Explanation:**
The common divisors of 12 and 15 are 1 and 3. The greatest among them is 3.

### Example 2:

**Input:**
```
a = 100, b = 25
```
**Output:**
```
25
```
**Explanation:**
25 divides both 100 and 25 evenly, and is the largest such number.

### Example 3:

**Input:**
```
a = 17, b = 29
```
**Output:**
```
1
```
**Explanation:**
Since 17 and 29 are co-prime, they have no common divisor other than 1.

## Constraints
- `1 <= a, b <= 10^9`

## Expected Time Complexity
- `O(log(min(a, b)))`, using the Euclidean algorithm.

## Expected Space Complexity
- `O(1)`, as it uses a constant amount of space.

